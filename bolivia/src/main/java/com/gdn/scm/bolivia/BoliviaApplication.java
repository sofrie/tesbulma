package com.gdn.scm.bolivia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gdn.scm.bolivia.entity.AWB;
import com.gdn.scm.bolivia.entity.Role;
import com.gdn.scm.bolivia.entity.User;
import com.gdn.scm.bolivia.receiver.Receiver;
import com.gdn.scm.bolivia.repository.UserRepository;
import com.gdn.scm.bolivia.services.SimpleOrderManager;
import com.gdn.scm.bolivia.services.UserService;
import config.CustomUserDetails;
//import config.CustomUserDetails;CustomUserDetails
import java.util.Arrays;
//import com.gdn.x.message.mq.model.MessageEmailRequest;
//import com.gdn.x.message.service.client.MessageTemplateDeliveryClient;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableFeignClients
@SpringBootApplication
public class BoliviaApplication {

    public final static String queueName = "spring-boot";
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder,UserRepository repository,UserService service)throws Exception{
        if(repository.count()==0)
            service.save(new User("user","password",Arrays.asList(new Role("MAKER"),new Role("CHECKER"),new Role("APPROVER"))));
        builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
    }
    
    private UserDetailsService userDetailsService(final UserRepository repository){
        return username -> new CustomUserDetails(repository.findByUsername(username));
    }

    @Bean
    Queue queue() {
        return new Queue(queueName, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("spring-boot-exchange");
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
            MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setConcurrentConsumers(10);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        return new CachingConnectionFactory("localhost");
    }
    
    @Bean
    public AmqpAdmin admin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        return rabbitTemplate;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        MessageListenerAdapter adapter = new MessageListenerAdapter(receiver, "receiveMessage");
        adapter.setMessageConverter(new Jackson2JsonMessageConverter(new ObjectMapper()));
        return adapter;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(AWB awb) {
        MessageListenerAdapter adapter = new MessageListenerAdapter(awb, "receiveMessage");
        adapter.setMessageConverter(new Jackson2JsonMessageConverter(new ObjectMapper()));
        return adapter;
    }
    
//    @Bean
//    MessageTemplateDeliveryClient template()
//    {
//        MessageTemplateDeliveryClient tmp=new MessageTemplateDeliveryClient("no-reply@blibli.com","password","172.17.138.17",5432,"clientId","channelId","storeId",queueName,"haha");
//        return tmp;
//    }
    

    public static void main(String[] args) {
        SpringApplication.run(BoliviaApplication.class, args);
        
    }
}

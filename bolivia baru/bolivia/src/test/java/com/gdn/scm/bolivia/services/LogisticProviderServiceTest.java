/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.services;

import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.repository.LogisticProviderRepository;
import java.math.BigDecimal;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.eq;
import org.mockito.Mockito;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sofrie.zumaytis
 */
public class LogisticProviderServiceTest {
    @Autowired
    private LogisticProviderService logisticProviderService;
    
    @Autowired
    private LogisticProviderRepository logisticProviderRepository;
    @Before
    public void setUp() {
        logisticProviderRepository = Mockito.mock(LogisticProviderRepository.class);
    }
    @Test
    public void createLogisticSuccessfuly() throws Exception {
        LogisticProvider logistic = new LogisticProvider("kode", "a logistic", "Active", new BigDecimal(10), new BigDecimal(7));
        
       logisticProviderRepository.save(logistic);
         assertThat(logistic.getStatus())
                .isEqualTo("Active");
    }
   
}

package hello;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	@Autowired
	CacheService cacheSrvice;

   // private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(Process message) throws InterruptedException {
        System.out.println("Received <" + message + ">");
        //bakal expired dalam 60 detik
        //klo proses uda selesai harusnya key nya di delete
        //if(cacheSrvice.setIfAbsent(message.getProccessId(), message.getRequestId(),60,TimeUnit.SECONDS))
        if(cacheSrvice.setIfAbsent(message.getProccessId(), message.getRequestId()))
        {
        	//berarti belum pernah ada yg nge set
        	System.out.println("Processing... "+message);
        	
        	//klo prosesnya uda selesai si key nya di delete
        	/*
        	file on process klo awb uda belum selesai diproses
        	per baris data nya di bikin jadi 1 object
        	data nya nembak ke X-Log
        	terus di kirim ke rabbit mq
        	
        	klo uda selesai 1, bakal ngirim ke rabbit mq yg lain, apakah semua awb uda selesai
        	klo uda selesai, key yg on process di delete
        	terus bakal ngubah status file jadi Done bukan Uploaded lagi
        	
        	
        	*/
        	Thread.sleep(5000);
        	cacheSrvice.delete(message.getProccessId());
        }
        else
        {
        	//lagi ada yg di proses
        	System.out.println("Error..."+message+" is still on process");
        }
       // latch.countDown();
    }

//    public CountDownLatch getLatch() {
//        return latch;
//    }

}

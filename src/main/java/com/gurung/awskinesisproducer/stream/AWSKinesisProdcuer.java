package com.gurung.awskinesisproducer.stream;

import com.gurung.awskinesisproducer.entity.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

/**
 * @author bir birs sgrg007@gmail.com
 * @project bir-microservices
 * @since 3/21/2022
 */
@Slf4j
@Component
public class AWSKinesisProdcuer {

    private BlockingQueue<Event> orderEvent=new LinkedBlockingDeque<>();

    @Bean
    public Supplier<Event> produceOrder(){
        return ()->this.orderEvent.poll();
    }

    public void sendOrder(Event event){
        event.setId(UUID.randomUUID());
        this.orderEvent.offer(event);
        log.info("Event sent: {}",event.toString());
    }
}

package com.example.detransimulate.consumer;

import com.example.detransimulate.dto.PlateRequestDto;
import com.example.detransimulate.entities.TrafficTicket;
import com.example.detransimulate.service.DetranService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DetranConsumer {

    private final DetranService detranService;

    @RabbitListener(queues = "${broker.queue.plate.park}")
    public void listenTrafficTicketQueue(@Payload PlateRequestDto plateRequestDto){
        detranService.generateDetranTrafficTicket(plateRequestDto.plate());
    }
}

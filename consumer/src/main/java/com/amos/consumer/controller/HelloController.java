package com.amos.consumer.controller;

import com.amos.api.common.GeneralResponse;
import com.amos.api.pojo.request.MessageRequest;
import com.amos.api.service.MessageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * PROJECT: consumer
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
@RestController
public class HelloController {

    @Reference
    private MessageService messageService;

    @GetMapping("hello/{message}")
    public String hello(@PathVariable("message") String message) {
        return messageService.message(message);
    }

    @GetMapping("hello2/{message}")
    public GeneralResponse hello2(@PathVariable("message") String message) {
        MessageRequest messageRequest = new MessageRequest();
        messageRequest.setMessage(message);
        messageRequest.setReceiver("Jack");
        messageRequest.setSender("Amos");
        messageRequest.setSendTime(LocalDateTime.now());

        return messageService.message(messageRequest);
    }

}

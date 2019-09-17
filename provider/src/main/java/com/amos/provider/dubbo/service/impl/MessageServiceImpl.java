package com.amos.provider.dubbo.service.impl;

import com.amos.api.common.GeneralResponse;
import com.amos.api.pojo.request.MessageRequest;
import com.amos.api.service.MessageService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * PROJECT: dubbo-provider
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/29
 */
@Service
@Component("messageService")
public class MessageServiceImpl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Override
    public String message(String message) {
        LOGGER.info("==============begin=====================");
        LOGGER.info("message is " + message);
        LOGGER.info("==============finish====================");
        return "Congratulations!";
    }

    @Override
    public GeneralResponse message(MessageRequest messageRequest) {
        LOGGER.info("==============begin=====================");
        LOGGER.info("message: " + messageRequest.getMessage());
        LOGGER.info("sender: " + messageRequest.getSender());
        LOGGER.info("send time: " + messageRequest.getSendTime());
        LOGGER.info("==============finish====================");

        return GeneralResponse.SUCCESS;
    }
}

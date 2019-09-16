package com.amos.api.service;

import com.amos.api.common.GeneralResponse;
import com.amos.api.pojo.request.MessageRequest;

/**
 * DESCRIPTION: hello service
 *
 * @author amos.wang
 * @date 2019/9/16
 */
public interface MessageService {

    /**
     * send message
     *
     * @param message message
     * @return response
     */
    String message(String message);

    /**
     * send message
     *
     * @param messageRequest message
     * @return GeneralResponse
     */
    GeneralResponse message(MessageRequest messageRequest);

}

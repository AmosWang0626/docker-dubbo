package com.amos.api.pojo.request;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DESCRIPTION: hello request
 *
 * @author amos.wang
 * @date 2019/9/16
 */
@Data
public class MessageRequest implements Serializable {

    private static final long serialVersionUID = -7770810875986917465L;

    /**
     * 消息
     */
    private String message;
    /**
     * 接收人
     */
    private String receiver;
    /**
     * 发送人
     */
    private String sender;
    /**
     * 发送时间
     */
    private LocalDateTime sendTime;

}

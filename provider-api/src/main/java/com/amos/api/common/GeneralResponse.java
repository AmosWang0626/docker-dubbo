package com.amos.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * DESCRIPTION: 通用 response
 *
 * @author amos.wang
 * @date 2019/9/16
 */
@Data
public class GeneralResponse<T> implements Serializable {

    private static final long serialVersionUID = 4349973103179343014L;

    public static final GeneralResponse SUCCESS = new GeneralResponse(GlobalConstant.SUCCESS_CODE, GlobalConstant.SUCCESS_MESSAGE);
    public static final GeneralResponse FAIL = new GeneralResponse(GlobalConstant.FAIL_CODE, GlobalConstant.FAIL_MESSAGE);

    private String code;

    private String message;

    private T body;

    /**
     * code为7位数，前三位区分业务系统，后四位为业务系统内部错误码
     *
     * @see GlobalConstant#SUCCESS_CODE 1000成功
     * @see GlobalConstant#FAIL_CODE 1001失败
     */
    public GeneralResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public GeneralResponse(T body) {
        this.code = GlobalConstant.SUCCESS_CODE;
        this.message = GlobalConstant.SUCCESS_MESSAGE;
        this.body = body;
    }

}

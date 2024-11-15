package com.pineone.zem.global.exception;

import com.pineone.zem.global.constants.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}

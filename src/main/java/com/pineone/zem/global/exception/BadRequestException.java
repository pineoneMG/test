package com.pineone.zem.global.exception;

import com.pineone.zem.global.constants.ErrorCode;

public class BadRequestException extends BusinessException {

    private static final ErrorCode ERROR_CODE = ErrorCode.BAD_REQUEST;

    public BadRequestException() {
        super(ERROR_CODE);
    }

    public BadRequestException(String message) {
        super(ERROR_CODE, message);
    }
}

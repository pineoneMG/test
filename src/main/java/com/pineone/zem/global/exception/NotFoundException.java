package com.pineone.zem.global.exception;

import com.pineone.zem.global.constants.ErrorCode;

public class NotFoundException extends BusinessException {

    private static final ErrorCode ERROR_CODE = ErrorCode.NOT_FOUND;

    public NotFoundException() {
        super(ERROR_CODE);
    }

    public NotFoundException(String message) {
        super(ERROR_CODE, message);
    }
}

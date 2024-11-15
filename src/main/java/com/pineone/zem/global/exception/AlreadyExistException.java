package com.pineone.zem.global.exception;

import com.pineone.zem.global.constants.ErrorCode;

public class AlreadyExistException extends BusinessException {

    private static final ErrorCode ERROR_CODE = ErrorCode.CONFLICT;

    public AlreadyExistException() {
        super(ERROR_CODE);
    }

    public AlreadyExistException(String message) {
        super(ERROR_CODE, message);
    }
}

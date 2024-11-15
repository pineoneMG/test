package com.pineone.zem.global.constants;

import org.springframework.http.HttpStatus;

public interface ResponseCode {

    String name();
    HttpStatus getHttpStatus();
    String getCode();
    String getDesc();
}

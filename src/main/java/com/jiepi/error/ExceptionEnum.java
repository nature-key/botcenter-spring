package com.jiepi.error;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
    SERVER_ERROR("SERVER_ERROR",HttpStatus.INTERNAL_SERVER_ERROR);

    ExceptionEnum(String error_desc, HttpStatus httpStatus) {
        this.error_desc = error_desc;
        this.httpStatus = httpStatus;
    }

    private String error_desc;
    private HttpStatus httpStatus;

    public String getError_desc() {
        return error_desc;
    }

    public void setError_desc(String error_desc) {
        this.error_desc = error_desc;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}

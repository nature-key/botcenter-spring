package com.jiepi.error;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {

    BOT_NOT_FOUBD(404, "NOT FOUND", HttpStatus.BAD_REQUEST),


    PARAM_ERROR(400,"PARAMS ERROR",HttpStatus.BAD_REQUEST);

    private int error_code;
    private String error_desc;
    private HttpStatus httpStatus;

    ExceptionEnum(int code, String msg, HttpStatus status) {
        this.error_code = code;
        this.error_desc = msg;
        this.httpStatus = status;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

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

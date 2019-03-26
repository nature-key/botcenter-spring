package com.jiepi.error;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -2486443993341553686L;

    private HttpStatus httpStatus;
    private int errorCode;
    public CustomException(HttpStatus httpStatus, int errorCode, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;

        // TODO Auto-generated constructor stub
    }

    public CustomException(String message, int errorCode, Exception e) {

        super(message, e.getCause());
        // TODO Auto-generated constructor stub
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

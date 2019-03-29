package com.jiepi.error;

public class ErrorDTO {

    private String error_code;
    private String error_desc;

    public ErrorDTO(String error_code, String error_desc) {
        this.error_code = error_code;
        this.error_desc = error_desc;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_desc() {
        return error_desc;
    }
    public void setError_desc(String error_desc) {
        this.error_desc = error_desc;
    }
}

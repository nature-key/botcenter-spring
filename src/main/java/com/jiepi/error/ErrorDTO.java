package com.jiepi.error;

public class ErrorDTO {

    private int error_code;
    private String error_desc;

    public ErrorDTO(int error_code, String error_desc) {
        super();
        this.error_code = error_code;
        this.error_desc = error_desc;
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
}

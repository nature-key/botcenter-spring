package com.jiepi.myenum;

public enum BotType {
    OFFICIAL(0),
    THIRD_PARTY(1);


    private int code;

    BotType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

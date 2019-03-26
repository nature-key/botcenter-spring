package com.jiepi.myenum;

public enum BotState {
    ACTIVE(0), INACTIVE(1), UNAUDIT(2), COMMIT(3);

    BotState(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

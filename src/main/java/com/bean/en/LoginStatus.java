package com.bean.en;

/**
 * @author Ash
 * @date 2018/7/21 10:41
 */
public enum LoginStatus implements  BaseEnum{
    OFFLINE(0,"offline"),ONLINE(1,"online");

    private int code;
    private String status;

    LoginStatus() {
    }

    LoginStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}

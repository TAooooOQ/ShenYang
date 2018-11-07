package com.bean.en;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Ash
 * @date 2018/7/15 17:00
 */
public enum ApplicationEnum implements BaseEnum {
    UNHANDLE(0, "unhandle"),REJECTED(1, "rejected"),AGREE(2, "agree");

    private int value;
    private String status;

    ApplicationEnum() {

    }

    ApplicationEnum(int value, String status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public int getCode() {
        return this.value;
    }

    @JsonValue
    public String getStatus() {
        return this.status;
    }
}

package com.bean.en;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Ash
 * @date 2018/7/15 15:25
 */
public enum PositionEnum implements BaseEnum {
    PRINCIPAL(1,"principal"),STAFF(0,"staff");

    private int value;
    private String type;

    PositionEnum() {
    }

    PositionEnum(int value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public int getCode() {
        return this.value;
    }

    @JsonValue
    public String getType() {
        return type;
    }
}

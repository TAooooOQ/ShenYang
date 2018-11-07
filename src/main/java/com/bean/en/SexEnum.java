package com.bean.en;

/**
 * @author Ash
 * @date 2018/7/18 15:11
 */
public enum SexEnum implements BaseEnum {
    MALE(1,"male"),FEMALE(0,"female");

    private int value;
    private String sex;

    SexEnum() {
    }

    SexEnum(int value, String sex) {
        this.value=value;
        this.sex=sex;
    }

    @Override
    public int getCode() {
        return value;
    }

    public String getSex(){
        return sex;
    }
}

package com.bean.model;

/**
 * @author Ash
 * @date 2018/7/15 10:13
 */
public class JsonResult <T>{
    private int code;
    private String message;
    private T data;

    private JsonResult(){

    }

    public static <T> JsonResult<T> genJsonResult() {
        return new JsonResult<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

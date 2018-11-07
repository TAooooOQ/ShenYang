package com.dao.po;

import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/7/21 15:57
 */
public class MessagePo implements Serializable{
    private Integer id;
    private String messageBody;
    private Integer readStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }
}

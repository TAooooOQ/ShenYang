package com.dao.po;

import com.bean.en.ApplicationEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * @description 权限申请数据实体
 * @author Ash
 * @date 2018/7/14 16:11
 */
public class ApplicationPo implements Serializable{
    private Integer id;
    private Integer application;
    private Integer userId;
    private Date requestDate;
    private ApplicationEnum status;

    public ApplicationEnum getStatus() {
        return status;
    }

    public void setStatus(ApplicationEnum status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplication() {
        return application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}

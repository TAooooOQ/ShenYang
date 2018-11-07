package com.dao.po;

import com.bean.en.PositionEnum;

import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/6/26 15:45
 */
public class ProjectStaffPo implements Serializable{
    private Integer id;
    private Integer projectId;
    private Integer staffId;
    private PositionEnum auth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public PositionEnum getAuth() {
        return auth;
    }

    public void setAuth(PositionEnum auth) {
        this.auth = auth;
    }
}

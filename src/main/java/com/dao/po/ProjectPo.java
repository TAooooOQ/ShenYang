package com.dao.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Ash
 * @date 2018/6/26 11:50
 */
public class ProjectPo implements Serializable{
    private Integer id;
    private String  projectName;
    private String  projectDescribe;
    private Date    buildTime;
    private String  projectType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescribe() {
        return projectDescribe;
    }

    public void setProjectDescribe(String projectDescribe) {
        this.projectDescribe = projectDescribe;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
}

package com.dao.po;

import com.bean.en.SexEnum;

import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/6/26 15:32
 */
public class StaffPo implements Serializable{
    private Integer id;
    private String staffName;
    private SexEnum staffSex;
    private Integer staffAge;
    private Integer staffPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public SexEnum getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(SexEnum staffSex) {
        this.staffSex = staffSex;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public Integer getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(Integer staffPhone) {
        this.staffPhone = staffPhone;
    }
}

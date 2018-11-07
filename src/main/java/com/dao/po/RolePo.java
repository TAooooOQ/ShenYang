package com.dao.po;

import java.io.Serializable;

/**
 * @author Ash
 * @date 2018/7/10 14:25
 */
public class RolePo implements Serializable {
    private Integer id;
    private String roleName;
    private Integer roleType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "RolePo{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleType='" + roleType + '\'' +
                '}';
    }
}

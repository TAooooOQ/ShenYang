package com.bean;

import com.dao.po.RolePo;
import com.dao.po.UserPo;

/**
 * @author Ash
 * @date 2018/7/13 14:41
 */
public class UserBean {
    UserPo userPo;
    RolePo rolePo;

    public UserPo getUserPo() {
        return userPo;
    }

    public void setUserPo(UserPo userPo) {
        this.userPo = userPo;
    }

    public RolePo getRolePo() {
        return rolePo;
    }

    public void setRolePo(RolePo rolePo) {
        this.rolePo = rolePo;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userPo=" + userPo +
                ", rolePo=" + rolePo +
                '}';
    }
}
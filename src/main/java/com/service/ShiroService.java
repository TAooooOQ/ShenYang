package com.service;

import com.dao.po.RolePo;
import com.dao.po.UserPo;

/**
 * @author Ash
 * @date 2018/7/11 15:38
 */

public interface ShiroService {
    RolePo getRoleByUser(UserPo user);
    UserPo getUserByUserName(String userName);
}

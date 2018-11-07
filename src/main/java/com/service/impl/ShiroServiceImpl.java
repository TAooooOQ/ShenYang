package com.service.impl;

import com.dao.ShiroDao;
import com.dao.po.RolePo;
import com.dao.po.UserPo;
import com.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ash
 * @date 2018/7/11 15:44
 */
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    ShiroDao shiroDao;

    @Override
    public RolePo getRoleByUser(UserPo user) {
        return shiroDao.getUserRoleByUserId(user.getId());
    }

    @Override
    public UserPo getUserByUserName(String userName) {
        return shiroDao.getUserByUserName(userName);
    }
}

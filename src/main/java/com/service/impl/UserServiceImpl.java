package com.service.impl;

import com.Utils.MD5Utils;
import com.bean.en.LoginStatus;
import com.dao.ShiroDao;
import com.dao.UserDao;
import com.dao.UserRoleDao;
import com.dao.po.UserPo;
import com.dao.po.UserRolePo;
import com.service.StaffService;
import com.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @describtion 用户登陆注册，管理员查看用户service
 * @author Ash
 * @date 2018/7/16 19:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    ShiroDao shiroDao;

    @Autowired
    StaffService staffService;

    @Autowired
    UserRoleDao userRoleDao;

    @Override
    public boolean insert(UserPo userPo) {
        String MD5password= MD5Utils.toHash(userPo.getUserName(),userPo.getPassword());
        userPo.setPassword(MD5password);
        if (userDao.insert(userPo)!=1)
            return false;
        UserRolePo userRolePo=new UserRolePo();
        userRolePo.setUserId(userDao.selectByName(userPo.getUserName()).getId());
        return userRoleDao.insert(userRolePo)==1;
    }

    @Override
    public UserPo selectByName(String userName){
       return userDao.selectByName(userName);
    }

    @Override
    public List<UserPo> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public UserPo login(String userName, String password) {
        String MD5password= MD5Utils.toHash(userName,password);
        UsernamePasswordToken token=new UsernamePasswordToken(userName,MD5password);
        Subject subject= SecurityUtils.getSubject();
        try {
            subject.login(token);
        }catch (UnknownAccountException | IncorrectCredentialsException uae) {
            return null;
        }

        userDao.updateStatus(userName, LoginStatus.ONLINE);
        UserPo user =shiroDao.getUserByUserName(userName);
        subject.getSession().setAttribute("user", user);
        return user;
    }

    @Override
    public boolean userNameCheck(String userName) {
        return userDao.selectByName(userName)!=null;
    }

    @Override
    public boolean logout(String userName) {
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        userDao.updateStatus(userName,LoginStatus.OFFLINE);
        return true;
    }

    @Override
    public int onlineUser() {
        return userDao.onlineUser();
    }

}

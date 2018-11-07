package com.service;

import com.dao.po.UserPo;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/16 19:28
 */
public interface UserService {

    boolean insert(UserPo userPo);
    UserPo selectByName(String userName);
    List<UserPo> selectAll();
    UserPo login(String userName, String password);
    boolean userNameCheck(String userName);
    boolean logout(String userName);
    int onlineUser();
}

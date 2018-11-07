package com.dao;

import com.bean.en.LoginStatus;
import com.dao.po.UserPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Ash
 * @date 2018/7/14 16:27
 */
@Repository
public interface UserDao extends BaseDao<UserPo>{
    UserPo selectByName(String userName);
    int updateStatus(@Param("userName") String userName,@Param("loginStatus") LoginStatus loginStatus);
    int onlineUser();
}

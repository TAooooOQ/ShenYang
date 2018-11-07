package com.dao;

import com.dao.po.RolePo;
import com.dao.po.UserPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Ash
 * @date 2018/7/11 20:55
 */
@Repository
public interface ShiroDao {

    UserPo getUserByUserName(@Param("userName") String userName);
    RolePo getUserRoleByUserId(int userId);
}

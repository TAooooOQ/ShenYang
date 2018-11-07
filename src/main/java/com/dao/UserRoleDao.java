package com.dao;

import com.dao.po.UserRolePo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @describtion 用户角色关系
 * @author Ash
 * @date 2018/7/16 10:11
 */
@Repository
public interface UserRoleDao {
     int update(@Param("roleId") Integer roleId,@Param("userId") Integer userId);
     int insert(UserRolePo userRolePo);
}

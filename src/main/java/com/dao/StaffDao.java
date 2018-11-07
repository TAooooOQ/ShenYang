package com.dao;

import com.dao.po.StaffPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ash
 * @date 2018/6/26 15:36
 */
@Repository
public interface StaffDao extends BaseDao<StaffPo>{
    StaffPo selectById(Integer id);
    List<StaffPo> selectByName(String staffName);
    List<StaffPo> selectByAge(@Param("beginAge") Integer beginAge,@Param("endAge") Integer endAge);
}

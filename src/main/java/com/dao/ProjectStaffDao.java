package com.dao;

import com.dao.po.ProjectStaffPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ash
 * @date 2018/6/26 15:47
 */
@Repository
public interface ProjectStaffDao extends BaseDao<ProjectStaffPo>{

    int deleteByInf(@Param("projectId") Integer projectId, @Param("staffId") Integer staffId);
    List<ProjectStaffPo> selectByProjectId(Integer projectId);
    List<ProjectStaffPo> selectByStaffId(Integer staffId);
    List<ProjectStaffPo> selectByAuth(Integer auth);   //选择负责人或成员
}

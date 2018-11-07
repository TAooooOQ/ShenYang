package com.dao;

import com.dao.po.ProjectPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author Ash
 * @date 2018/6/26 11:53
 */
@Repository
public interface ProjectDao extends BaseDao<ProjectPo>{

    ProjectPo selectById(Integer id);
    List<ProjectPo> selectByName(String name);
    List<ProjectPo> selectByDescribe(String keyword);
    List<ProjectPo> selectByDate(@Param("beginTime") Date beginTime,@Param("endTime") Date endTime);
    List<ProjectPo> selectByType(String type);
}

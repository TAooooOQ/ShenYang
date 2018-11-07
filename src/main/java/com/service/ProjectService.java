package com.service;

import com.dao.po.ProjectPo;

import java.util.Date;
import java.util.List;

/**
 * @author Ash
 * @date 2018/7/11 15:39
 */
public interface ProjectService extends BaseService<ProjectPo>{


    ProjectPo selectById(Integer id);
    List<ProjectPo> selectByName(String name);
    List<ProjectPo> selectByDescribe(String keyword);
    List<ProjectPo> selectByDate(Date beginTime, Date endTime);
    List<ProjectPo> selectByType(String type);
}

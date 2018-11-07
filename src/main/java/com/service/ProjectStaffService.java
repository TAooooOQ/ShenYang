package com.service;

import com.dao.po.ProjectPo;
import com.dao.po.ProjectStaffPo;
import com.dao.po.StaffPo;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 18:49
 */
public interface ProjectStaffService extends BaseService<ProjectStaffPo>{

    boolean delete(Integer projectId,Integer staffId);
    List<StaffPo> selectWithOutProjectId(Integer projectId);
    boolean insert(Integer projectId,Integer[] staffIds);
    List<StaffPo> selectByProjectId(Integer projectId);
    List<ProjectPo> selectByStaffId(Integer staffId);
    List<ProjectStaffPo> selectByAuth(Integer auth);
}

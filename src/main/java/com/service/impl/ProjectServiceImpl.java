package com.service.impl;

import com.dao.ProjectDao;
import com.dao.ProjectStaffDao;
import com.dao.po.ProjectPo;
import com.dao.po.ProjectStaffPo;
import com.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @description 处理Project服务
 * @author Ash
 * @date 2018/6/26 13:30
 */

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectStaffDao projectStaffDao;

    public List<ProjectPo> listAll() {      //查询所有项目记录
        List<ProjectPo> projects = projectDao.selectAll();
        return projects == null ? Collections.emptyList() : projects;
    }

    public boolean insert(ProjectPo projectPo){  //添加新项目
        projectPo.setBuildTime(new Date());
        return projectDao.insert(projectPo)==1;
    }

    public boolean delete(Integer id){
           List<ProjectStaffPo> projectStaffPos=projectStaffDao.selectByProjectId(id);
           for (ProjectStaffPo item:projectStaffPos){
               if(projectStaffDao.delete(item.getId())!=1)
                   return false;
           }
           return projectDao.delete(id)==1;
    }

    public boolean update(ProjectPo projectPo){  //按id检索更改项目信息
        return projectDao.update(projectPo)==1;
    }

    public ProjectPo selectById(Integer id){
        return projectDao.selectById(id);
    }

    public List<ProjectPo> selectByType(String type){
        List<ProjectPo> projects=projectDao.selectByType(type);
        return projects==null?Collections.emptyList():projects;
    }

    public List<ProjectPo> selectByName(String name){
        List<ProjectPo> projects=projectDao.selectByName(name);
        return projects==null?Collections.emptyList():projects;
    }

    public List<ProjectPo> selectByDescribe(String keyword){
        List<ProjectPo> projects=projectDao.selectByDescribe(keyword);
        return projects==null?Collections.emptyList():projects;
    }

    public List<ProjectPo> selectByDate(Date beginTime,Date endTime){
        List<ProjectPo> projects=projectDao.selectByDate(beginTime, endTime);
        return projects==null?Collections.emptyList():projects;
    }
}

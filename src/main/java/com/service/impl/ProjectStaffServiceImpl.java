package com.service.impl;

import com.dao.ProjectDao;
import com.dao.ProjectStaffDao;
import com.dao.StaffDao;
import com.dao.po.ProjectPo;
import com.dao.po.ProjectStaffPo;
import com.dao.po.StaffPo;
import com.service.ProjectStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ash
 * @date 2018/7/17 14:45
 */
@Service
public class ProjectStaffServiceImpl implements ProjectStaffService{

    @Autowired
    ProjectStaffDao projectStaffDao;

    @Autowired
    StaffDao staffDao;

    @Autowired
    ProjectDao projectDao;

    @Override
    public boolean update(ProjectStaffPo projectStaffPo) {
        return projectStaffDao.update(projectStaffPo)==1;
    }

    @Override
    public boolean delete(Integer projectId,Integer staffId) {
        return projectStaffDao.deleteByInf(projectId,staffId)==1;
    }

    @Override
    public List<ProjectStaffPo> listAll() {
        return projectStaffDao.selectAll();
    }

    @Override
    public boolean insert(ProjectStaffPo projectStaffPo) {
        return projectStaffDao.insert(projectStaffPo)==1;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }


    /**
     * @describtion 为指定项目添加一组员工
     * @param projectId
     * @param staffIds
     * @return
     */
    @Override
    public boolean insert(Integer projectId, Integer[] staffIds) {
        ProjectStaffPo projectStaffPo=new ProjectStaffPo();
        projectStaffPo.setProjectId(projectId);
        for (Integer item:staffIds){
            projectStaffPo.setStaffId(item);
            if(projectStaffDao.insert(projectStaffPo)!=1)
                return false;
        }
        return true;
    }

    @Override
    public List<StaffPo> selectByProjectId(Integer projectId) {
        List<ProjectStaffPo> projectStaffPos = projectStaffDao.selectByProjectId(projectId);
        List<StaffPo> staffPos =new ArrayList<>();
        for (ProjectStaffPo item:projectStaffPos){
            staffPos.add(staffDao.selectById(item.getStaffId()));
        }
        return staffPos;
    }

    @Override
    public List<StaffPo> selectWithOutProjectId(Integer projectId) {
        List<ProjectStaffPo> projectStaffPos = projectStaffDao.selectAll();
        List<StaffPo> staffPos =staffDao.selectAll();
        for (ProjectStaffPo item:projectStaffPos){
            staffPos.remove(staffDao.selectById(item.getStaffId()));
        }
        return staffPos;
    }

    @Override
    public List<ProjectPo> selectByStaffId(Integer staffId) {
        List<ProjectStaffPo> projectStaffPos= projectStaffDao.selectByStaffId(staffId);
        List<ProjectPo> projectPos=new ArrayList<>();
        for (ProjectStaffPo item:projectStaffPos){
            projectPos.add(projectDao.selectById(item.getProjectId()));
        }
         return projectPos;
    }

    @Override
    public List<ProjectStaffPo> selectByAuth(Integer auth) {
        return projectStaffDao.selectByAuth(auth);
    }


}

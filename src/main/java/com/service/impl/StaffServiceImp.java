package com.service.impl;

import com.dao.ProjectStaffDao;
import com.dao.StaffDao;
import com.dao.po.ProjectStaffPo;
import com.dao.po.StaffPo;
import com.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/17 14:39
 */
@Service
public class StaffServiceImp implements StaffService{

    @Autowired
    StaffDao staffDao;

    @Autowired
    ProjectStaffDao projectStaffDao;

    @Override
    public List<StaffPo> listAll() {
        return staffDao.selectAll();
    }

    @Override
    public boolean insert(StaffPo staffPo) {
        return staffDao.insert(staffPo)==1;
    }

    @Override
    public boolean delete(Integer id) {
        List<ProjectStaffPo> projectStaffPos=projectStaffDao.selectByStaffId(id);
        for (ProjectStaffPo item:projectStaffPos){
            if (projectStaffDao.delete(item.getId())!=1)
                return false;
        }
        return staffDao.delete(id)==1;
    }

    @Override
    public boolean update(StaffPo staffPo) {
        return staffDao.update(staffPo)==1;
    }

    @Override
    public StaffPo selectById(Integer id) {
        return staffDao.selectById(id);
    }
}

package com.service.impl;

import com.bean.en.ApplicationEnum;
import com.dao.ApplicationDao;
import com.dao.UserRoleDao;
import com.dao.po.ApplicationPo;
import com.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @describion 权限请求及处理service
 * @author Ash
 * @date 2018/7/17 19:40
 */
@Service
public class ApplicationServiceImpl implements ApplicationService{


    @Autowired
    ApplicationDao  applicationDao;

    @Autowired
    UserRoleDao userRolesDao;


    /**
     * @describtion: 处理请求同时更新用户权限
     * @param applicationPo
     *  application参数 1.user 2.admin 3.root
     * @return
     */
    @Override
    public boolean update(ApplicationPo applicationPo) {
        if (applicationPo.getStatus()== ApplicationEnum.AGREE)
            userRolesDao.update(applicationPo.getApplication(),applicationPo.getUserId());
        return applicationDao.update(applicationPo)==1;
    }

    @Override
    public boolean delete(Integer id) {
        return applicationDao.delete(id)==id;
    }

    @Override
    public List<ApplicationPo> listAll() {
        return applicationDao.selectAll();
    }

    @Override
    public boolean insert(ApplicationPo applicationPo) {
        return applicationDao.insert(applicationPo)==1;
    }

    @Override
    public List<ApplicationPo> selectAllWaiting() {
        return applicationDao.selectAllWaiting();
    }

    /**
     * @describtion 用户功能，查看当前用户请求
     * @param id
     * @return
     */
    @Override
    public List<ApplicationPo> selectByUserId(Integer id) {
        return applicationDao.selectByUserId(id);
    }
}

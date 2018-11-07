package com.service;

import com.dao.po.ApplicationPo;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 18:33
 */
public interface ApplicationService extends BaseService<ApplicationPo>{

    List<ApplicationPo> selectAllWaiting();
    List<ApplicationPo> selectByUserId(Integer id);
}

package com.service;

import com.dao.po.StaffPo;

/**
 * @author Ash
 * @date 2018/7/14 18:48
 */
public interface StaffService extends BaseService<StaffPo> {

    StaffPo selectById(Integer id);
}

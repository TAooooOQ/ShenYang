package com.dao;

import com.dao.po.ApplicationPo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 16:22
 */
@Repository

public interface ApplicationDao extends BaseDao<ApplicationPo>{

    List<ApplicationPo> selectAllWaiting();
    List<ApplicationPo> selectByUserId(Integer id);
}

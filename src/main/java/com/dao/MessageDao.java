package com.dao;

import com.dao.po.MessagePo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/21 16:14
 */
@Repository
public interface MessageDao {
    List<MessagePo> selectUnread();
    int insert(String message);
    int read(Integer id);
}

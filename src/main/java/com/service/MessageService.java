package com.service;

import com.dao.po.MessagePo;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/22 11:19
 */
public interface MessageService {

    List<MessagePo> selectUnread();
    int read(List<MessagePo> messagePos);
}

package com.service.impl;

import com.dao.MessageDao;
import com.dao.po.MessagePo;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Ash
 * @date 2018/7/22 11:25
 */
@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageDao messageDao;

    @Override
    public List<MessagePo> selectUnread() {
        List<MessagePo> messagePos=messageDao.selectUnread();
        return messagePos==null? Collections.emptyList():messagePos;
    }

    @Override
    public int read(List<MessagePo> messagePos) {
        for (MessagePo item:messagePos){
            if (messageDao.read(item.getId())!=1)
                return 0;
        }
        return 1;
    }
}

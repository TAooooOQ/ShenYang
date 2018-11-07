package com.aop;

import com.bean.model.JsonResult;
import com.dao.MessageDao;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/22 15:02
 */
@Aspect
@Component
public class MessageAop {

    @Autowired
    MessageDao messageDao;

    @AfterReturning(value = "execution(* com.web.MessageController.*(..))",returning = "list")
    public void setReadStatus(JsonResult list){
        for(Object item:(List)list.getData())
            System.err.println(item.toString());
    }

}

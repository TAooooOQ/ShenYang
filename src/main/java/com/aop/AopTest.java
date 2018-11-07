package com.aop;

import com.dao.MessageDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Ash
 * @date 2018/7/9 14:31
 */
@Aspect
@Component
public class AopTest {

    @Autowired
    MessageDao messageDao;

    @After("execution(* insert(Object+,..)) && within(com.web.*)")
    public void insertMessage(JoinPoint joinPoint){
        String a=joinPoint.getTarget().toString().replaceAll("com.web.","").replaceAll("Controller","");
        a=a.substring(0,a.indexOf("@"));
        messageDao.insert("insert option about"+a+" at "+new Date().toString());
    }

     @After("execution(* update(Object+,..)) && within(com.web.*)")
    public void updateMessage(JoinPoint joinPoint){
        String a=joinPoint.getTarget().toString().replaceAll("com.web.","").replaceAll("Controller","");
        a=a.substring(0,a.indexOf("@"));
        messageDao.insert("Update option about "+a+"  at "+new Date().toString());
    }

    @After("execution(* delete(Integer,..)) && within(com.web.*)&&args(id)")
    public void deleteMessage(JoinPoint joinPoint,Integer id){
        String a=joinPoint.getTarget().toString().replaceAll("com.web.","").replaceAll("Controller","");
        a=a.substring(0,a.indexOf("@"));
        messageDao.insert("Delete "+a+" ID "+id+" at "+new Date().toString());
    }
}

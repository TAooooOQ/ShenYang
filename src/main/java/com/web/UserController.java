package com.web;

import com.Utils.JsonGenerator;
import com.bean.model.JsonResult;
import com.dao.po.UserPo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @author Ash
 * @date 2018/7/11 11:22
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/logincheck")
    @ResponseBody
    public JsonResult loginCheck(String userName, String password){
        UserPo user=userService.login(userName,password);
         return  user!=null?
                 JsonGenerator.getResult(user,"success"):
                 JsonGenerator.getErrResult("Incorrect UserName or PassWord");
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        UserPo userPo=(UserPo)session.getAttribute("user");
        userService.logout(userPo.getUserName());
        return "login";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/userNameCheck")
    @ResponseBody
    public JsonResult userNameCheck(String userName){
        if(userService.userNameCheck(userName)){
            return JsonGenerator.getErrResult("Username already exists");
        }else return JsonGenerator.getSuccessResult();
    }


    @RequestMapping("/signUp")
    @ResponseBody
    public JsonResult signUp(UserPo userPo){
        if(userService.selectByName(userPo.getUserName())!=null){
            return JsonGenerator.getErrResult("Username already exists");
        }
        else {
            if(userService.insert(userPo))
                return JsonGenerator.getSuccessResult();
            else return JsonGenerator.getErrResult("Insert new user failed");
        }
    }

    @RequestMapping("/onlineUser")
    @ResponseBody
    public JsonResult onlineUser(){
        return JsonGenerator.getResult(userService.onlineUser(),"success");
    }
}

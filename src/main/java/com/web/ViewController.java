package com.web;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Ash
 * @date 2018/6/26 21:11
 */
@Controller
public class ViewController {
    @RequestMapping("/index")
    public String home(){
        return "index";
    }

    @RequestMapping("/myapplication")
    public String tables(){
        return "MyApplication";
    }

    @RequiresRoles(value={"root","admin"},logical= Logical.OR)
    @RequestMapping("/insertProject")
    public String insertProject(){
        return "InsertProject";
    }

    @RequiresRoles(value={"root","admin"},logical= Logical.OR)
    @RequestMapping("/insertEmployee")
    public String insertEmployee(){
        return "InsertEmployee";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }

    @RequestMapping("/application")
    public String application(){
        return "Application";
    }

    @RequestMapping("/projectList")
    public String projectList(){
        return "ProjectList";
    }

    @RequestMapping("/staffList")
    public String staffList(){
        return "StaffList";
    }

    @RequiresRoles("root")
    @RequestMapping("/applicationList")
    public String applicationList(){
        return "ApplicationList";
    }

    @RequestMapping("/projectStaffList")
    public String projectStaffList(){
        return "ProjectStaffList";
    }

    @RequestMapping("/file")
    public String file(){
        return "file";
    }

    @RequestMapping("/testFile")
    public String testFile(@RequestPart("file") MultipartFile file) throws IOException {
        file.transferTo(new File("C:/Users/Administrator/Desktop/emms-master/"+file.getOriginalFilename()));
        return "file";
    }
}

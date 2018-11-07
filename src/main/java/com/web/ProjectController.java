package com.web;

import com.Utils.JsonGenerator;
import com.bean.model.JsonResult;
import com.dao.po.ProjectPo;
import com.service.ProjectService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Ash
 * @date 2018/6/26 13:28
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/listAll") //查询所有项目信息
    @ResponseBody
    public List<ProjectPo> listAll() {
        return projectService.listAll();
    }


    @RequestMapping("/insert")  //添加新项目
    @ResponseBody
    public JsonResult insert(ProjectPo insertPo){
        if (projectService.insert(insertPo))
        return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("Insert failed");
    }

    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(ProjectPo projectPo){
        if (projectService.update(projectPo))
            return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("update failed");
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Integer id){
        if (projectService.delete(id))
            return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("delete failed");
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public JsonResult<ProjectPo> selectById(Integer id){
        return JsonGenerator.getResult(projectService.selectById(id),"success") ;
    }

    @RequestMapping("/selectByName")
    @ResponseBody
    public JsonResult<List<ProjectPo>> selectByName(String name){
        return JsonGenerator.getResult(projectService.selectByName(name),"success") ;
    }

    @RequestMapping("/selectByType")
    @ResponseBody
    public List<ProjectPo> selectByType(String type){
        return projectService.selectByType(type);
    }

    @RequiresRoles("admin")
    @RequestMapping("/selectByDate")
    @ResponseBody
    public JsonResult<List<ProjectPo>> selectByDate(Date beginTime
                                        , Date endTime){
        return JsonGenerator.getResult(projectService.selectByDate(beginTime, endTime),"success");
    }

    @RequestMapping("/selectByDescribe")
    @ResponseBody
    public JsonResult<List<ProjectPo>> selectByDescribe(String keyword) {
        return JsonGenerator.getResult(projectService.selectByDescribe(keyword),"success");
    }


    /**
     * @decribtion date格式转换
     * @param binder
     */
    @InitBinder({"beginTime","endTime"})
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}
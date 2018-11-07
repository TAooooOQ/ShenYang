package com.web;

import com.Utils.JsonGenerator;
import com.bean.model.JsonResult;
import com.dao.po.StaffPo;
import com.service.ProjectStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/17 19:47
 */
@RequestMapping("/projectStaff")
@Controller
public class ProjectStaffController {

    @Autowired
    ProjectStaffService projectStaffService;

    @RequestMapping("/selectByProjectId")
    @ResponseBody
    public List<StaffPo> selectByProjectId(Integer projectId){
        return projectStaffService.selectByProjectId(projectId);
    }

    @RequestMapping("/selectWithOutProjectId")
    @ResponseBody
    public List<StaffPo> selectWithOutProjectId(Integer projectId){
        return projectStaffService.selectWithOutProjectId(projectId);
    }

    @RequestMapping("/selectByStaffId")
    @ResponseBody
    public JsonResult selectByStaffId(Integer staffId){
        return JsonGenerator.getResult(projectStaffService.selectByStaffId(staffId),"success");
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insert(Integer projectId,Integer[] staffId){
        if (projectStaffService.insert(projectId,staffId))
            return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("insert failed");
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Integer projectId,Integer staffId){
        if (projectStaffService.delete(projectId,staffId))
            return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("delete failed");
    }
}

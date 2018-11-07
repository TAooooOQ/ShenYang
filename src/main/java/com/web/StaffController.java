package com.web;

import com.Utils.JsonGenerator;
import com.bean.en.SexEnum;
import com.bean.model.JsonResult;
import com.dao.po.StaffPo;
import com.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 18:53
 */
@RequestMapping("/staff")
@Controller
public class StaffController {

    @Autowired
    StaffService staffService;

    @RequestMapping("/listAll")
    @ResponseBody
    public List<StaffPo> listAll(){
        return staffService.listAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insert(StaffPo insertPo,int sex){
        insertPo.setStaffSex(sex==1?SexEnum.MALE:SexEnum.FEMALE);
        return staffService.insert(insertPo)?
                JsonGenerator.getSuccessResult():
                JsonGenerator.getErrResult("insert failed");
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Integer id){
        return staffService.delete(id)?
                JsonGenerator.getSuccessResult():
                JsonGenerator.getErrResult("delete failed");
    }

    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(StaffPo staffPo,int sex){
        if (sex==1)
            staffPo.setStaffSex(SexEnum.MALE);
        else staffPo.setStaffSex(SexEnum.FEMALE);
        return staffService.update(staffPo)?
                JsonGenerator.getSuccessResult():
                JsonGenerator.getErrResult("update failed");
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public JsonResult selectById(Integer  id){
        return JsonGenerator.getResult(staffService.selectById(id),"success");
    }
}

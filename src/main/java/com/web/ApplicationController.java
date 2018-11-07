package com.web;


import com.Utils.JsonGenerator;
import com.bean.en.ApplicationEnum;
import com.bean.model.JsonResult;
import com.dao.po.ApplicationPo;
import com.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/14 18:52
 */
@RequestMapping("/application")
@Controller
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @RequestMapping("/listAll")
    @ResponseBody
    public List<ApplicationPo> listAll(){
        return applicationService.listAll();
    }


    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insert(ApplicationPo insertPo){
        if(applicationService.insert(insertPo))
            return  JsonGenerator.getSuccessResult();
        return JsonGenerator.getErrResult("insert failed");
    }


    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(ApplicationPo applicationPo,int result){
        if(result==1)
            applicationPo.setStatus(ApplicationEnum.REJECTED);
        else applicationPo.setStatus(ApplicationEnum.AGREE);
        if (applicationService.update(applicationPo))
            return JsonGenerator.getSuccessResult();
        else return JsonGenerator.getErrResult("update status failed");
    }

    @RequestMapping("/selectAllWaiting")
    @ResponseBody
    public List<ApplicationPo> selectAllWaiting(){
        return applicationService.selectAllWaiting();
    }

    @RequestMapping("/selectByUserId")
    @ResponseBody
    public List<ApplicationPo> selectByUserId(Integer id){
        return applicationService.selectByUserId(id);
    }

}

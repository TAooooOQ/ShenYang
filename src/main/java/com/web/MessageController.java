package com.web;

import com.Utils.JsonGenerator;
import com.bean.model.JsonResult;
import com.dao.po.MessagePo;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ash
 * @date 2018/7/22 11:28
 */
@RequestMapping("/message")
@Controller
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping("/checkMessage")
    @ResponseBody
    public JsonResult checkMessage(){
        List<MessagePo> messageList=messageService.selectUnread();
        messageService.read(messageList);
        return JsonGenerator.getResult(messageList,"success");
    }

}

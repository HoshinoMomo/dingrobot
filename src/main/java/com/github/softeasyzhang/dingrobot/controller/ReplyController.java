package com.github.softeasyzhang.dingrobot.controller;

import com.alibaba.fastjson.JSON;
import com.github.softeasyzhang.dingrobot.controller.handler.TestHandler;
import com.github.softeasyzhang.dingrobot.controller.handler.YPYFBHandler;
import com.github.softeasyzhang.dingrobot.entity.RobotRequest;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import com.github.softeasyzhang.dingrobot.util.DefaultValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

@Controller
@RequestMapping("/ding/robot")
public class ReplyController {

    private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);

    /**
     * YPYFB  优配研发部
     * WTFKQ  优配问题反馈群
     * @param httpServletRequest
     */
    @ResponseBody
    @RequestMapping(value = "/reply",method = RequestMethod.POST)
    public String reply(HttpServletRequest httpServletRequest, @RequestBody RobotRequest robotRequest){
        logger.info("获得请求参数{}",JSON.toJSONString(robotRequest));
        String token = httpServletRequest.getHeader("token");
        String content = robotRequest.getText().getContent();
        String senderId = robotRequest.getSenderId();
        logger.info("用户{}发送消息给机器人:Token{},Content{}",senderId,token,content);

        BaseHandler baseHandler = new TestHandler();
        if(DefaultValue.YPYFB.equals(token)){
            baseHandler = new YPYFBHandler();
        }

        String response = baseHandler.getResultMessage(content);
        logger.info("获得返回值:{}",response);
        RobotResponse robotResponse = new RobotResponse();
        robotResponse.setText(new RobotResponse.Text(){{setContent(response);}});
        robotResponse.setAt(new RobotResponse.At(){{setAtDingtalkIds(Collections.singletonList(senderId));}});
        return JSON.toJSONString(robotResponse);
    }
}
package com.github.softeasyzhang.dingrobot.controller;

import com.alibaba.fastjson.JSON;
import com.github.softeasyzhang.dingrobot.controller.handler.TestHandler;
import com.github.softeasyzhang.dingrobot.controller.handler.WTFKQHandler;
import com.github.softeasyzhang.dingrobot.controller.handler.YPYFBHandler;
import com.github.softeasyzhang.dingrobot.entity.RobotRequest;
import com.github.softeasyzhang.dingrobot.service.IWhoIsTurn;
import com.github.softeasyzhang.dingrobot.util.DefaultValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private IWhoIsTurn whoIsTurn;

    @RequestMapping("/whoIsTurn")
    public void reply(){
       logger.info(JSON.toJSONString(whoIsTurn.getWhoIsTurn()));
    }
}

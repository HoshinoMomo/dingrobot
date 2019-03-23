package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.controller.BaseHandler;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import org.springframework.stereotype.Component;

import java.util.Collections;
@Component
public class YPYFBHandler implements BaseHandler {
    @Override
    public RobotResponse getResultMessage(String content, String senderId) {
        String result = "";

        if("".equals(content)){
            result = "";
        }
        if(content.contains("分享")){
            result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=69399927";
        }else if(content.contains("jar")){
            result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=79030052 ";
        }else if(content.contains("值班")){
            result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=85308939";
        }else if(content.contains("张易")){
            result = "张易是大帅哥，哈哈哈";
        }
        result = "你可以跟我说：值班、jar、分享,获取相应1的confluence地址\n" + result;

        return RobotResponse.build(result,Collections.singletonList(senderId));
    }
}


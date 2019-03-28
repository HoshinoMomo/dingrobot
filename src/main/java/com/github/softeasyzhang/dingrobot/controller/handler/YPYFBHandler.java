package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.entity.AllMember;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import org.springframework.stereotype.Component;

import javax.script.Invocable;
import java.util.ArrayList;

@Component
public class YPYFBHandler implements BaseHandler {

    private final String jsRoot = baseRoot + "/YPYFB/ypyfb.js";

    @Override
    public RobotResponse getResultMessage(String content, String senderId) {

        try {
            //执行脚本
            Invocable invocable = getInvocable(jsRoot);
            String result = (String) invocable.invokeFunction("handle",content);
            return RobotResponse.build(result+"",senderId,new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            return RobotResponse.build("暂无您要的信息",senderId,new ArrayList<>());
        }

    }
}


package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import org.springframework.stereotype.Component;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.util.ArrayList;

@Component
public class YPYFBHandler implements BaseHandler {

    private final String jsRoot = baseRoot + "/YPYFB/ypyfb.js";
    private final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

    @Override
    public RobotResponse getResultMessage(String content, String senderId) {

        try {
            //执行脚本
            engine.eval(new FileReader(jsRoot));
            Invocable invocable = (Invocable)engine;
            String result = (String) invocable.invokeFunction("handle",content);
            return RobotResponse.build(result+"",senderId,new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            return RobotResponse.build("暂无您要的信息",senderId,new ArrayList<>());
        }

    }
}


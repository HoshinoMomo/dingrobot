package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.entity.RobotResponse;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

/**
 * 策略模式抽象角色
 */
public interface BaseHandler {

    String baseRoot = "js";

    RobotResponse getResultMessage(String content, String senderId);

    default Invocable getInvocable(String jsFileUrl){
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
            engine.eval(new FileReader(jsFileUrl));
            return  (Invocable)engine;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

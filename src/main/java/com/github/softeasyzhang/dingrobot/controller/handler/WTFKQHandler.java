package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.entity.AllMember;
import com.github.softeasyzhang.dingrobot.entity.Employee;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import com.github.softeasyzhang.dingrobot.service.IWhoIsTurn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class WTFKQHandler implements BaseHandler {

    private final String jsRoot = baseRoot + "/WTFKQ/wtfkq.js";
    private final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

    @Autowired
    private IWhoIsTurn whoIsTurn;

    @Override
    public RobotResponse getResultMessage(String content, String senderId) {
        List<String> atMobiles = new ArrayList<>();
        Employee employee = whoIsTurn.getWhoIsTurn();
        String msg = "\n 今日值班人:" + employee.getName() + "\n 电话:" + employee.getDingNo();

        try {
            //执行脚本
            engine.eval(new FileReader(jsRoot));
            Invocable invocable = (Invocable)engine;
            String result = (String) invocable.invokeFunction("handle",content, AllMember.getAllMembers(),atMobiles);
            //@发送人  @今天值班人
            atMobiles.add(whoIsTurn.getWhoIsTurn().getDingNo());
            return RobotResponse.build(result + msg,senderId,atMobiles);
        } catch (Exception e) {
            e.printStackTrace();
            return RobotResponse.build("暂无您要的信息",senderId,new ArrayList<>());
        }

    }
}


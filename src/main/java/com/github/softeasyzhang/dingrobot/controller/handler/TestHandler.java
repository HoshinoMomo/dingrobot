package com.github.softeasyzhang.dingrobot.controller.handler;


import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class TestHandler implements BaseHandler {
    @Override
    public RobotResponse getResultMessage(String content, String senderId) {
        return RobotResponse.build(content,senderId,new ArrayList<>());
    }
}


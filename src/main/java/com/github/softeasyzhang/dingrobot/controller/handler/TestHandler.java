package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.controller.BaseHandler;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import org.springframework.stereotype.Component;

import java.util.Collections;
@Component
public class TestHandler implements BaseHandler {
    @Override
    public RobotResponse getResultMessage(String content, String senderId) {
        return RobotResponse.build(content,Collections.singletonList(senderId));
    }
}


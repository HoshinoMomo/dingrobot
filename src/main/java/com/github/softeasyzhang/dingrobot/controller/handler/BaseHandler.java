package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.entity.RobotResponse;

/**
 * 策略模式抽象角色
 */
public interface BaseHandler {

    String baseRoot = "js";

    RobotResponse getResultMessage(String content, String senderId);

}

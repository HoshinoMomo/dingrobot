package com.github.softeasyzhang.dingrobot.controller;

import com.github.softeasyzhang.dingrobot.entity.RobotResponse;

/**
 * 策略模式抽象角色
 */
public interface BaseHandler {

    RobotResponse getResultMessage(String content, String senderId);

}

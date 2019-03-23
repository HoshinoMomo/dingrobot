package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.controller.BaseHandler;

public class TestHandler implements BaseHandler {
    @Override
    public String getResultMessage(String content) {
        return content;
    }
}


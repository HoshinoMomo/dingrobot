package com.github.softeasyzhang.dingrobot.service;

import com.github.softeasyzhang.dingrobot.entity.Employee;

public interface IWhoIsTurn {

    /**
     * 获得今天值班人的钉钉号
     * @return
     */
    Employee getWhoIsTurn();
}

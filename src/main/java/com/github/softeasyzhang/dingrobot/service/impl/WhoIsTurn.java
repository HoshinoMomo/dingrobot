package com.github.softeasyzhang.dingrobot.service.impl;

import com.github.softeasyzhang.dingrobot.entity.AllMember;
import com.github.softeasyzhang.dingrobot.entity.Employee;
import com.github.softeasyzhang.dingrobot.service.IWhoIsTurn;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class WhoIsTurn implements IWhoIsTurn {

    /**
     * 时间基线
     */
    private static final LocalDate baseLocalDate = LocalDate.of(2019,04,02);

    /**
     * 参与排班的人
     */
    private static final List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(AllMember.getAllMembers().get("景启明"));
        employeeList.add(AllMember.getAllMembers().get("刘丹"));
        employeeList.add(AllMember.getAllMembers().get("司建珂"));
        employeeList.add(AllMember.getAllMembers().get("王利"));
        employeeList.add(AllMember.getAllMembers().get("鲁俊"));
        employeeList.add(AllMember.getAllMembers().get("徐展"));
        employeeList.add(AllMember.getAllMembers().get("常智胜"));
        employeeList.add(AllMember.getAllMembers().get("张易"));
        employeeList.add(AllMember.getAllMembers().get("郭申"));
    }

    @Override
    public Employee getWhoIsTurn() {
        //计算现在到基线时间的天数
        Period nowToBase = Period.between(baseLocalDate,LocalDate.now());
        //计算开始时间所对应的偏移量
        int beginIndex = nowToBase.getDays() % employeeList.size();
        return employeeList.get(beginIndex);
    }
}

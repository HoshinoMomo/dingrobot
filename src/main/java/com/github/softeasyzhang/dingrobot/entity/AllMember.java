package com.github.softeasyzhang.dingrobot.entity;

import java.util.HashMap;
import java.util.Map;

public class AllMember {

    private static final Map<String,Employee> membersHashMap = new HashMap<>(32);

    static {
        membersHashMap.put("张易",new Employee("张易","easyzhang"));
        membersHashMap.put("郭申",new Employee("郭申","easyzhang"));
        membersHashMap.put("徐展",new Employee("徐展","easyzhang"));
        membersHashMap.put("唐杰",new Employee("唐杰","easyzhang"));
        membersHashMap.put("司建珂",new Employee("司建珂","easyzhang"));
        membersHashMap.put("景启明",new Employee("景启明","easyzhang"));
        membersHashMap.put("刘丹",new Employee("刘丹","easyzhang"));
        membersHashMap.put("王利",new Employee("王利","easyzhang"));
        membersHashMap.put("鲁俊",new Employee("鲁俊","easyzhang"));
        membersHashMap.put("常智胜",new Employee("常智胜","easyzhang"));

        membersHashMap.put("高岩",new Employee("高岩","easyzhang"));
        membersHashMap.put("王凯萌",new Employee("王凯萌","easyzhang"));
        membersHashMap.put("徐瑞",new Employee("徐瑞","easyzhang"));
        membersHashMap.put("杨熹",new Employee("杨熹","easyzhang"));
    }

    public static Map<String,Employee> getAllMembers(){
        return membersHashMap;
    }
}

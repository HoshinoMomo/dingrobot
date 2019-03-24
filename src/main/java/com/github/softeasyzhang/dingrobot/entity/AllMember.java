package com.github.softeasyzhang.dingrobot.entity;

import java.util.HashMap;
import java.util.Map;

public class AllMember {

    private static final Map<String,Employee> membersHashMap = new HashMap<>(32);

    static {
        membersHashMap.put("张易",new Employee("张易","16619959981"));
        membersHashMap.put("郭申",new Employee("郭申","18515275581"));
        membersHashMap.put("徐展",new Employee("徐展","15652200945"));
        membersHashMap.put("唐杰",new Employee("唐杰","18514236025"));
        membersHashMap.put("司建珂",new Employee("司建珂","13552244212"));
        membersHashMap.put("景启明",new Employee("景启明","18610457753"));
        membersHashMap.put("刘丹",new Employee("刘丹","15210075882"));
        membersHashMap.put("王利",new Employee("王利","15201126483"));
        membersHashMap.put("鲁俊",new Employee("鲁俊","15116276835"));
        membersHashMap.put("常智胜",new Employee("常智胜","18258288296"));

        membersHashMap.put("高岩",new Employee("高岩","18710018068"));
        membersHashMap.put("王凯萌",new Employee("王凯萌","ifr7zfk"));
        membersHashMap.put("徐瑞",new Employee("徐瑞","18683954321"));
        membersHashMap.put("杨熹",new Employee("杨熹","15803135353"));
    }

    public static Map<String,Employee> getAllMembers(){
        return membersHashMap;
    }
}

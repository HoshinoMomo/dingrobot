package com.github.softeasyzhang.dingrobot.entity;

import java.util.HashMap;
import java.util.Map;

public class AllMember {

    private static final Map<String,Employee> membersHashMap = new HashMap<>(32);

    static {
        membersHashMap.put("张易",new Employee("张易","easyzhang"));
        membersHashMap.put("郭申",new Employee("郭申","xsgzxguoshen"));
        membersHashMap.put("徐展",new Employee("徐展","bv019db"));
        membersHashMap.put("唐杰",new Employee("唐杰","hwahj2e"));
        membersHashMap.put("司建珂",new Employee("司建珂","d39omvq"));
        membersHashMap.put("景启明",new Employee("景启明","yrkb9kc"));
        membersHashMap.put("刘丹",new Employee("刘丹","sif1mgi"));
        membersHashMap.put("王利",new Employee("王利","thppr3z"));
        membersHashMap.put("鲁俊",new Employee("鲁俊","kem34yz"));
        membersHashMap.put("常智胜",new Employee("常智胜","td0p29a"));

        membersHashMap.put("高岩",new Employee("高岩","gaoyan02"));
        membersHashMap.put("王凯萌",new Employee("王凯萌","ifr7zfk"));
        membersHashMap.put("徐瑞",new Employee("徐瑞","eewzlvy"));
        membersHashMap.put("杨熹",new Employee("杨熹","bkmssx9"));
    }

    public static Map<String,Employee> getAllMembers(){
        return membersHashMap;
    }
}

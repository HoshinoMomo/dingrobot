package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.controller.BaseHandler;

public class YPYFBHandler implements BaseHandler {
    @Override
    public String getResultMessage(String content) {
        if("".equals(content)){
            return "";
        }
        if(content.contains("分享")){
           return "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=69399927";
        }else if(content.contains("jar")){
           return "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=79030052 ";
        }else if(content.contains("值班")){
           return "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=85308939";
        }else if(content.contains("张易")){
           return "张易是大帅哥，哈哈哈";
        }
        content = "你可以跟我说：值班、jar、分享,获取相应的confluence地址\n" + content;
        return content;
    }
}


package com.github.softeasyzhang.dingrobot.controller.handler;

import com.github.softeasyzhang.dingrobot.controller.BaseHandler;
import com.github.softeasyzhang.dingrobot.entity.AllMember;
import com.github.softeasyzhang.dingrobot.entity.Employee;
import com.github.softeasyzhang.dingrobot.entity.RobotResponse;
import com.github.softeasyzhang.dingrobot.service.IWhoIsTurn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class WTFKQHandler implements BaseHandler {

    @Autowired
    private IWhoIsTurn whoIsTurn;

    @Override
    public RobotResponse getResultMessage(String content, String senderId) {
        String result = "";
        List<String> atMobiles = new ArrayList<>();
        Employee employee = whoIsTurn.getWhoIsTurn();
        String msg = "\n 今日值班人:" + employee.getName() + "\n 电话:" + employee.getDingNo();

        if(content.contains("下单")){
            result = "如果是App,请确认手机型号并告知QA同学! \n QA同学会进行复现,稍后通知您结果" ;
            atMobiles.add(AllMember.getAllMembers().get("高岩").getDingNo());
        }else if(content.contains("余额") || content.contains("账单")){
            result = "已经帮@结算、余额侧的同学";
            atMobiles.add(AllMember.getAllMembers().get("杨熹").getDingNo());
            atMobiles.add(AllMember.getAllMembers().get("王凯萌").getDingNo());
        }else if(content.contains("合作")){
            result = "杰哥帮忙反馈一下";
            atMobiles.add(AllMember.getAllMembers().get("唐杰").getDingNo());
        }else if(content.contains("临时单") || content.contains("货的单")){
            result = "感谢反馈,正在找相关的人查看";
            atMobiles.add(AllMember.getAllMembers().get("徐展").getDingNo());
        }else if(content.contains("充值")){
            result = "建议先到优配后台查询一下充值状态";
            atMobiles.add(AllMember.getAllMembers().get("景启明").getDingNo());
        }else if(content.contains("展示")){
            result = "已收到谢谢";
            atMobiles.add(AllMember.getAllMembers().get("徐瑞").getDingNo());
        }else if(content.contains("PC")){
            atMobiles.add(AllMember.getAllMembers().get("刘丹").getDingNo());
            atMobiles.add(AllMember.getAllMembers().get("景启明").getDingNo());
        }else if(content.contains("司机端")){
            atMobiles.add(AllMember.getAllMembers().get("王利").getDingNo());
        }else if(content.contains("反作弊")){
            atMobiles.add(AllMember.getAllMembers().get("范兴杰").getDingNo());
        }else {
            result = content;
        }

        //@发送人  @今天值班人
        atMobiles.add(whoIsTurn.getWhoIsTurn().getDingNo());
        return RobotResponse.build(result + msg,senderId,atMobiles);
    }
}


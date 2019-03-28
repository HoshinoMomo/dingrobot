

function handle(content,result,allMembers,atMobiles) {


    if(content.contains("下单")){
        result = "如果是App,请确认手机型号并告知QA同学! \n QA同学会进行复现,稍后通知您结果" ;
        atMobiles.push(allMembers.高岩.dingNo);
    }else if(content.contains("余额") || content.contains("账单")){
        result = "已经帮@结算、余额侧的同学";
        atMobiles.push(allMembers. 杨熹.dingNo());
        atMobiles.push(allMembers. 王凯萌.dingNo());
    }else if(content.contains("合作")){
        result = "杰哥帮忙反馈一下";
        atMobiles.push(allMembers. 唐杰.dingNo());
    }else if(content.contains("临时单") || content.contains("货的单")){
        result = "感谢反馈,正在找相关的人查看";
        atMobiles.push(allMembers. 徐展.dingNo());
    }else if(content.contains("充值")){
        result = "建议先到优配后台查询一下充值状态";
        atMobiles.push(allMembers. 景启明.dingNo());
    }else if(content.contains("展示")){
        result = "已收到谢谢";
        atMobiles.push(allMembers. 徐瑞.dingNo());
    }else if(content.contains("PC")||content.contains("官网")){
        result = "PC官网可能有点问题";
        atMobiles.push(allMembers. 刘丹.dingNo());
        atMobiles.push(allMembers. 景启明.dingNo());
    }else if(content.contains("司机端")){
        result = "司机端有点问题";
        atMobiles.push(allMembers. 王利.dingNo());
    }else if(content.contains("反作弊")){
        result = "用户触发了反作弊校验，麻烦帮忙看看是什么原因，谢谢。";
        atMobiles.push(allMembers. 范兴杰.dingNo());
    }else {
        result = content;
    }

    return result;
}
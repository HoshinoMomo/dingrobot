

function handle(content) {

    let result = "";

    if(content.contains("分享")){
        result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=69399927";
    }else if(content.contains("jar")){
        result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=85308939";
    }else if(content.contains("值班")){
        result = "http://confluence.daojia-inc.com/pages/viewpage.action?pageId=79030052 ";
    }else if(content.contains("张易")){
        result = "张易是大帅哥，哈哈哈";
    }else if(content.contains("邮件")){
        result += "全组:kg-ppdd@daojia-inc.com \n";
        result += "RD:kg-ppd@daojia-inc.com \n";
        result += "FE:kg-fe-p@daojia-inc.com\n";
        result += "QA:kg-qa-pp@daojia-inc.com\n";
    }else {
        result = "你可以跟我说：值班、jar、分享,获取相应1的confluence地址\n";
    }
    return result;
}
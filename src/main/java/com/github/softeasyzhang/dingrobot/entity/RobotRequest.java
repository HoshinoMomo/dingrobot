package com.github.softeasyzhang.dingrobot.entity;

/**
 * "msgtype": "text",
 *     "text": {
 *         "content": "我就是我, 是不一样的烟火"
 *     },
 *     "createAt": 1487561654123,
 *     "conversationType": 2,
 *     "conversationId": "12345",
 *     "conversationTitle": "钉钉群",
 *     "senderId": "dingtalk1235",
 *     "senderNick": "星星",
 *     "senderStaffId":"075263",
 *     "isAdmin":false,
 *     "context":"用户自定义上下文",
 *     "chatbotCorpId":"test",
 *     "chatbotUserId":"XXX"
 */
public class RobotRequest {

    private String msgType;
    private Text text;
    private String senderId;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public static class Text{
        private String content;
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
    }

}

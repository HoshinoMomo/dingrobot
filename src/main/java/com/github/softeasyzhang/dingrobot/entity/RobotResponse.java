package com.github.softeasyzhang.dingrobot.entity;

import java.util.List;

public class RobotResponse {

    private String msgtype = "text";
    private Text text;
    private At at;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public At getAt() {
        return at;
    }

    public void setAt(At at) {
        this.at = at;
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

    public static class At{
        private List<String> atMobiles;
        private List<String> atDingtalkIds;
        private boolean isAtAll = false;

        public List<String> getAtMobiles() {
            return atMobiles;
        }

        public void setAtMobiles(List<String> atMobiles) {
            this.atMobiles = atMobiles;
        }

        public List<String> getAtDingtalkIds() {
            return atDingtalkIds;
        }

        public void setAtDingtalkIds(List<String> atDingtalkIds) {
            this.atDingtalkIds = atDingtalkIds;
        }

        public boolean getIsAtAll() {
            return isAtAll;
        }

        public void setIsAtAll(boolean isAtAll) {
            this.isAtAll = isAtAll;
        }
    }
}

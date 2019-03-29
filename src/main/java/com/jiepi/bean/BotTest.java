package com.jiepi.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class BotTest {
    private String fcid;
    private String passWord;
    private String name;
    private boolean enableGroupChat=true;
    private int state ;
    private String distributeBot;
    private int type ;

    private  boolean isBot;
    @JsonProperty(value = "isBot")
    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    public int getState() {
        return state;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "BotTest{" +
                "fcid='" + fcid + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", enableGroupChat=" + enableGroupChat +
                ", state=" + state +
                ", distributeBot='" + distributeBot + '\'' +
                ", type=" + type +
                '}';
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDistributeBot() {
        return distributeBot;
    }



    public void setDistributeBot(String distributeBot) {
        this.distributeBot = distributeBot;
    }



    public String getFcid() {
        return fcid;
    }

    public void setFcid(String fcid) {
        this.fcid = fcid;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnableGroupChat() {
        return enableGroupChat;
    }

    public void setEnableGroupChat(boolean enableGroupChat) {
        this.enableGroupChat = enableGroupChat;
    }

}

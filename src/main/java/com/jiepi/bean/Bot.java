package com.jiepi.bean;

import com.jiepi.myenum.BotState;
import com.jiepi.myenum.BotType;

import java.util.HashSet;
import java.util.Set;


public class Bot {
    private String fcid;
    private String passWord;
    private String name;
    private boolean enableGroupChat=true;
    private String description = "机器人";
    private String distributeBot ="";
    private Set<AuthTags> authTags = new HashSet<AuthTags>();
    private String developer;
    private Set<OsType> osType = new HashSet<OsType>();
    private Set<AppType> appType = new HashSet<AppType>();
    private int state = BotState.UNAUDIT.getCode();
    private int type = BotType.OFFICIAL.getCode();
    private boolean isBot = true;



    public Bot(String fcid, String passWord, String name, boolean enableGroupChat, String description, String distributeBot, String developer, int state, int type, boolean isBot) {
        this.fcid = fcid;
        this.passWord = passWord;
        this.name = name;
        this.enableGroupChat = enableGroupChat;
        this.description = description;
        this.distributeBot = distributeBot;
        this.developer = developer;
        this.state = state;
        this.type = type;
        this.isBot = isBot;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistributeBot() {
        return distributeBot;
    }

    public void setDistributeBot(String distributeBot) {
        this.distributeBot = distributeBot;
    }

    public Set<AuthTags> getAuthTags() {
        return authTags;
    }

    public void setAuthTags(Set<AuthTags> authTags) {
        this.authTags = authTags;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Set<OsType> getOsType() {
        return osType;
    }

    public void setOsType(Set<OsType> osType) {
        this.osType = osType;
    }

    public Set<AppType> getAppType() {
        return appType;
    }

    public void setAppType(Set<AppType> appType) {
        this.appType = appType;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }
}

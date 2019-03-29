package com.jiepi.bean;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;


public class Bot {
    private String fcid;
    private String passWord;
    private String name;
    private boolean enableGroupChat;
    private String description ;
    private String distributeBot;
    private List<AuthTags> authTags;
    private String developer;
    private List<OsType> osType;
    private List<AppType> appType ;
    private int state ;
    private int type ;
    @JsonProperty(value = "isBot")
    private boolean isBot;



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

    public List<AuthTags> getAuthTags() {
        return authTags;
    }

    public void setAuthTags(List<AuthTags> authTags) {
        this.authTags = authTags;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<OsType> getOsType() {
        return osType;
    }

    public void setOsType(List<OsType> osType) {
        this.osType = osType;
    }

    public List<AppType> getAppType() {
        return appType;
    }

    public void setAppType(List<AppType> appType) {
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

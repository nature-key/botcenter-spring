package com.jiepi.bean;

public class AuthTags {
    private Integer id;

    private  String name;

    private  String botId;

    public AuthTags(Integer id, String name, String botId) {
        this.id = id;
        this.name = name;
        this.botId = botId;
    }

    public AuthTags(String name, String botId) {
        this.name = name;
        this.botId = botId;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public AuthTags(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

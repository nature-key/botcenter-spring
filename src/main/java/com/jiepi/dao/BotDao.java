package com.jiepi.dao;

import com.jiepi.bean.Bot;

import java.util.List;


public interface BotDao {
    List<Bot> findBots();

    Bot findBot(String fcid);

    int deleteBot(String fcid);

    String save(Bot bot);
}

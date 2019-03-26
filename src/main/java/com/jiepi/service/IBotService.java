package com.jiepi.service;

import com.jiepi.bean.Bot;

import java.util.List;
import java.util.Map;

public interface IBotService {
     List<Bot> findBots();

     Bot findBot();

     String save(Map<String,Object> map);

     int delete(String fcid);

     Bot update(Map map);
}

package com.jiepi.service.imp;

import com.jiepi.bean.AppType;
import com.jiepi.bean.AuthTags;
import com.jiepi.bean.Bot;
import com.jiepi.bean.OsType;
import com.jiepi.dao.AppTypeDao;
import com.jiepi.dao.AuthTagsDao;
import com.jiepi.dao.BotDao;
import com.jiepi.dao.OsTypeDao;
import com.jiepi.service.IBotService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BotService implements IBotService {

    static Logger log4j = Logger.getLogger(BotService.class);


    @Autowired
    private BotDao botDao;

    @Autowired
    private AuthTagsDao authTagsDao;

    @Autowired
    private OsTypeDao osTypeDao;

    @Autowired
    private AppTypeDao appTypeDao;

    public List<Bot> findBots() {
        return null;
    }

    public Bot findBot() {
        return null;
    }

    public Map<String, Object> save(Map<String, Object> map) {
        Map<String, Object> responseMap = new HashMap<>();
        Bot bot = null;
        List<String> authTagsSet = new ArrayList<>();
        List<String> osTypeSet = new ArrayList<>();
        List<String> appTypeSet = new ArrayList<>();
        String fcid = map.get("fcid").toString();
        String passWord = map.get("passWord").toString();
        String name = map.get("name").toString();
        boolean enableGroupChat = Boolean.parseBoolean(map.get("enableGroupChat").toString());
        String description = map.get("description").toString();
        String distributeBot = map.get("distributeBot").toString();
        String developer = map.get("developer").toString();
        int state = Integer.valueOf(map.get("state").toString());
        int type = Integer.valueOf(map.get("type").toString());
        boolean isBot = Boolean.parseBoolean(map.get("isBot").toString());
        authTagsSet = (List<String>) map.get("authTags");
        osTypeSet = (List<String>) map.get("osType");
        appTypeSet = (List<String>) map.get("appType");
        bot = new Bot(fcid, passWord, name, enableGroupChat, description, distributeBot, developer, state, type, isBot);
        int botId = botDao.save(bot);
        if(botId>0){
            List<AuthTags> listAuth = authTagsSet.stream().map(it -> new AuthTags(it, fcid)).collect(Collectors.toList());
            List<OsType> listOs = osTypeSet.stream().map(it -> new OsType(it, fcid)).collect(Collectors.toList());
            List<AppType> listAPP = appTypeSet.stream().map(it -> new AppType(it, fcid)).collect(Collectors.toList());
            authTagsDao.save(listAuth);
            osTypeDao.save(listOs);
            appTypeDao.save(listAPP);
            responseMap.put("fcid", fcid);
        }
        return responseMap;

    }

    public int delete(String fcid) {
        return 0;
    }

    public Bot update(Map map) {
        return null;
    }
}

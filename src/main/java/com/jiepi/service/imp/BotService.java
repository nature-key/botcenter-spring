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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BotService implements IBotService {

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

    public String save(Map<String, Object> map) {


        String fcid = map.get("fcid").toString();
        String passWord = map.get("passWord").toString();
        String name = map.get("name").toString();
        boolean enableGroupChat = Boolean.parseBoolean(map.get("enableGroupChat").toString());
        String description = map.get("description").toString();
        String distributeBot = map.get("distributeBot").toString();
        Set<String> authTagsSet = (Set<String>) map.get("authTags");
        String developer = map.get("developer").toString();
        Set<String> osTypeSet = (Set<String>) map.get("osType");
        Set<String> appTypeSet = (Set<String>) map.get("appType");
        int state = Integer.valueOf(map.get("state").toString());
        int type = Integer.valueOf(map.get("type").toString());
        boolean isBot = Boolean.parseBoolean(map.get("isBot").toString());


        Bot bot = new Bot(fcid, passWord, name, enableGroupChat, description, distributeBot, developer, state, type, isBot);
        final String botId = botDao.save(bot);

        List<AuthTags> listAuth = authTagsSet.stream().map(it -> new AuthTags(it, botId)).collect(Collectors.toList());
        List<OsType> listOs = osTypeSet.stream().map(it -> new OsType(it, botId)).collect(Collectors.toList());
        List<AppType> listAPP = appTypeSet.stream().map(it -> new AppType(it, botId)).collect(Collectors.toList());
        authTagsDao.save(listAuth);
        osTypeDao.save(listOs);
        appTypeDao.save(listAPP);
        return botId;
    }

    public int delete(String fcid) {
        return 0;
    }

    public Bot update(Map map) {
        return null;
    }
}

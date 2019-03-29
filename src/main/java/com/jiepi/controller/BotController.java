package com.jiepi.controller;

import com.jiepi.bean.BotTest;
import com.jiepi.service.IBotService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/v1/fc")
public class BotController {
    public static Logger LOGGER = Logger.getLogger(BotController.class);
    @Resource
    private IBotService botService;

    @RequestMapping(value = "/bot", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> save(@RequestBody BotTest bot) {
        System.out.println(bot.toString());

//        Map resultMap = botService.save(map);
        Map resultMap = new HashMap();
        return resultMap;
    }
}

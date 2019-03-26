package com.jiepi.controller;

import com.jiepi.bean.Bot;
import com.jiepi.service.IBotService;
import com.jiepi.service.imp.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/api/v1/fc")
public class BotController {

    @Resource
    private IBotService botService;

    @RequestMapping(value = "/bot", method = RequestMethod.POST)
    public String save(@RequestBody Map<String, Object> map) {
        String botId = botService.save(map);
        return botId;
    }
}

package com.jiepi.controller;

import com.jiepi.service.IBotService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/fc")
public class BotController {
    static Logger log4j = Logger.getLogger(BotController.class);
    @Resource
    private IBotService botService;

    @RequestMapping(value = "/bot", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> save(@RequestBody Map<String, Object> map)  {

        return botService.save(map);
    }
}

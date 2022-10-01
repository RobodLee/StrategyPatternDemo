package com.robod.strategypatterndemo.controller;

import com.robod.strategypatterndemo.entity.req.AnswersSubmitReq;
import com.robod.strategypatterndemo.entity.res.Result;
import com.robod.strategypatterndemo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ActivityController
 * @Description
 * @Author Robod
 * @Date 2022/10/1 14:46
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@RestController
@RequestMapping("activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /**
     * @Author Robod
     * @Description 用户提交答案
     * @Date 14:43 2022/10/1
     * @Param req 答案
     * @return {@link Result<Boolean>}
     **/
    @PostMapping("/submitAnswers")
    public Result<Boolean> submitAnswers(@RequestBody @Validated AnswersSubmitReq req) {
        return activityService.submitAnswers(req);
    }

}

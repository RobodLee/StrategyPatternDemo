package com.robod.strategypatterndemo.service;

import com.robod.strategypatterndemo.entity.req.AnswersSubmitReq;
import com.robod.strategypatterndemo.entity.res.Result;

/**
 * @ClassName ActivityService
 * @Description
 * @Author Robod
 * @Date 2022/10/1 14:42
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public interface ActivityService {

    /**
     * @Author Robod
     * @Description 用户提交答案
     * @Date 14:43 2022/10/1
     * @Param req 答案
     * @return {@link Result<Boolean>}
     **/
    Result<Boolean> submitAnswers(AnswersSubmitReq req);

}

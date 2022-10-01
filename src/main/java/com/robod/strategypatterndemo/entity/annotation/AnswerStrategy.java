package com.robod.strategypatterndemo.entity.annotation;

import com.robod.strategypatterndemo.entity.enums.AnswerStrategyEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Strategy
 * @Description TODO
 * @Author Robod
 * @Date 2022/10/1 15:04
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnswerStrategy {

    AnswerStrategyEnum strategyMode();

}

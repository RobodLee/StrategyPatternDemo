package com.robod.strategypatterndemo.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName AnswerStrategyEnum
 * @Description
 * @Author Robod
 * @Date 2022/10/1 23:31
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Getter
@AllArgsConstructor
public enum AnswerStrategyEnum {

    /**
     * 简单模式。任意答对六道题即可。
     */
    EASY(1, "简单模式"),

    /**
     * 中等模式。五道简单题答对其中3道；3道中等题答对其中2道；2道困难题答对其中1道
     */
    MEDIUM(2, "中等模式"),

    /**
     * 困难模式。6道中等题答对其中4道；4道困难题答对其中2道。
     */
    HARD(3, "困难模式");

    private final Integer code;

    private final String info;

}

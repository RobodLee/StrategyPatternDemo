package com.robod.strategypatterndemo.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ResultCodeEnum
 * @Description TODO
 * @Author Robod
 * @Date 2022/10/1 13:19
 * @Version 1.0
 * @github :https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

    SUCCESS("800"),

    FAIL("900");

    private final String value;

}

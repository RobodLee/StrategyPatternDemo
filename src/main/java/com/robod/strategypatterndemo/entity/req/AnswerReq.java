package com.robod.strategypatterndemo.entity.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName AnswerReq
 * @Description 用户回答
 * @Author Robod
 * @Date 2022/10/1 14:26
 * @Version 1.0
 * @github :<a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
public class AnswerReq {

    /**
     * 题目id
     */
    @NotNull
    private Long id;

    /**
     * 用户的答案
     */
    @NotEmpty
    private String userAnswer;

    /**
     * 难度。1-easy。2-medium。3-hard
     */
    @NotNull
    private Integer level;

}

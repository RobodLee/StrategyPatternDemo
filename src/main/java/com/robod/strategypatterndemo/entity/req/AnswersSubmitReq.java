package com.robod.strategypatterndemo.entity.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @ClassName AnswersSubmitReq
 * @Description 用户提交的答案
 * @Author Robod
 * @Date 2022/10/1 14:39
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
public class AnswersSubmitReq {

    /**
     * 用户id
     */
    @NotNull
    private Long userId;

    /**
     * 答题策略
     */
    @NotNull
    private Integer answerMode;

    @NotEmpty
    private List<AnswerReq> answers;

}

package com.robod.strategypatterndemo.entity.res;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName QuestionRes
 * @Description 返回到前端的题目
 * @Author Robod
 * @Date 2022/10/1 14:32
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
public class QuestionRes implements Serializable {

    /**
     * 题目id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 题目内容
     */
    private String title;

    /**
     * 选项A
     */
    private String optionA;

    /**
     * 选项B
     */
    private String optionB;

    /**
     * 选项C
     */
    private String optionC;

    /**
     * 选项D
     */
    private String optionD;

    /**
     * 难度。1-easy。2-medium。3-hard
     */
    private Integer level;

}
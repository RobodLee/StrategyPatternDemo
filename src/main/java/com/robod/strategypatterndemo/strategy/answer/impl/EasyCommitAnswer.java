package com.robod.strategypatterndemo.strategy.answer.impl;

import com.robod.strategypatterndemo.entity.enums.AnswerStrategyEnum;
import com.robod.strategypatterndemo.entity.req.AnswerReq;
import com.robod.strategypatterndemo.entity.res.Result;
import com.robod.strategypatterndemo.strategy.answer.ICommitAnswer;

import java.util.List;
import java.util.Map;

/**
 * @ClassName EasyCommitAnswer
 * @Description 简单模式。任意答对六道题即可。
 * @Author Robod
 * @Date 2022/10/1 14:58
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class EasyCommitAnswer implements ICommitAnswer {

//    @Override
//    public Result<Boolean> execute(List<AnswerReq> param) {
//        int rightAnswer = 0;    // 正确回答的数量
//        for (AnswerReq answer : param) {
//            // 根据题目id获取从数据库中获取正确答案。此步骤略。假定正确答案是A
//            String right = "A";
//
//            rightAnswer += StrUtil.equals(answer.getUserAnswer(), right) ? 1 : 0;
//        }
//        if (rightAnswer >= 6) {
//            return Result.<Boolean>success().data(true);
//        }
//        return Result.<Boolean>fail().data(false);
//    }

    @Override
    public Result<Boolean> execute(List<AnswerReq> answers) {
        Map<Integer, Integer> rightAnswerCountMap = this.computerRightCount(answers);
        if (rightAnswerCountMap.get(AnswerStrategyEnum.EASY.getCode()) >= 6) {
            return Result.<Boolean>success().data(true).message("闯关成功");
        }
        return Result.<Boolean>success().data(false).message("闯关失败");
    }

}

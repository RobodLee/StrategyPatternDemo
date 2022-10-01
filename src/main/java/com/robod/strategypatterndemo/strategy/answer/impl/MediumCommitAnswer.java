package com.robod.strategypatterndemo.strategy.answer.impl;

import com.robod.strategypatterndemo.entity.enums.AnswerStrategyEnum;
import com.robod.strategypatterndemo.entity.req.AnswerReq;
import com.robod.strategypatterndemo.entity.res.Result;
import com.robod.strategypatterndemo.strategy.answer.ICommitAnswer;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MediumCommitAnswer
 * @Description 中等模式。五道简单题答对其中3道；3道中等题答对其中2道；2道困难题答对其中1道
 * @Author Robod
 * @Date 2022/10/1 15:02
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class MediumCommitAnswer implements ICommitAnswer {

//    @Override
//    public Result<Boolean> execute(List<AnswerReq> param) {
//        Map<Integer, Integer> rightAnswer = new HashMap<>();
//        rightAnswer.put(AnswerStrategyEnum.EASY.getCode(), 0);  // 简单题回答正确的数量
//        rightAnswer.put(AnswerStrategyEnum.MEDIUM.getCode(), 0);  // 中等题回答正确的数量
//        rightAnswer.put(AnswerStrategyEnum.HARD.getCode(), 0);  // 困难题回答正确的数量
//        for (AnswerReq answer : param) {
//            // 根据题目id获取从数据库中获取正确答案。此步骤略。假定正确答案是A
//            String right = "A";
//
//            int addCount = StrUtil.equals(right, answer.getUserAnswer()) ? 1 : 0;
//            rightAnswer.put(answer.getLevel(), rightAnswer.get(answer.getLevel()) + addCount);
//        }
//        if (rightAnswer.get(AnswerStrategyEnum.EASY.getCode()) >= 3
//                && rightAnswer.get(AnswerStrategyEnum.MEDIUM.getCode()) >= 2
//                && rightAnswer.get(AnswerStrategyEnum.HARD.getCode()) >= 1) {
//            return Result.<Boolean>success().data(true).message("闯关成功");
//        }
//        return Result.<Boolean>fail().data(false).message("闯关失败");
//    }

    @Override
    public Result<Boolean> execute(List<AnswerReq> answers) {
        Map<Integer, Integer> rightAnswerCountMap = this.computerRightCount(answers);
        if (rightAnswerCountMap.get(AnswerStrategyEnum.EASY.getCode()) >= 3
                && rightAnswerCountMap.get(AnswerStrategyEnum.MEDIUM.getCode()) >= 2
                && rightAnswerCountMap.get(AnswerStrategyEnum.HARD.getCode()) >= 1) {
            return Result.<Boolean>success().data(true).message("闯关成功");
        }
        return Result.<Boolean>success().data(false).message("闯关失败");
    }

}

package com.robod.strategypatterndemo.strategy.answer;

import cn.hutool.core.util.StrUtil;
import com.robod.strategypatterndemo.entity.enums.AnswerStrategyEnum;
import com.robod.strategypatterndemo.entity.req.AnswerReq;
import com.robod.strategypatterndemo.entity.res.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ICommitAnswer
 * @Description 用户提交答案判断策略接口
 * @Author Robod
 * @Date 2022/10/1 23:31
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public interface ICommitAnswer {

    Result<Boolean> execute(List<AnswerReq> answers);

//    Result<Boolean> execute(Map<Integer, Integer> rightAnswerCountMap);

    default Map<Integer,Integer> computerRightCount(List<AnswerReq> answers) {
        Map<Integer, Integer> rightAnswerCountMap = new HashMap<>();
        rightAnswerCountMap.put(AnswerStrategyEnum.EASY.getCode(), 0);  // 简单题回答正确的数量
        rightAnswerCountMap.put(AnswerStrategyEnum.MEDIUM.getCode(), 0);  // 中等题回答正确的数量
        rightAnswerCountMap.put(AnswerStrategyEnum.HARD.getCode(), 0);  // 困难题回答正确的数量
        for (AnswerReq answer : answers) {
            // 根据题目id获取从数据库中获取正确答案。此步骤略。假定正确答案是A
            String right = "A";

            int addCount = StrUtil.equals(right, answer.getUserAnswer()) ? 1 : 0;
            rightAnswerCountMap.put(answer.getLevel(), rightAnswerCountMap.get(answer.getLevel()) + addCount);
        }
        return rightAnswerCountMap;
    }

}

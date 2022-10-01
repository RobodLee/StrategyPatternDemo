package com.robod.strategypatterndemo.strategy.answer;

import com.robod.strategypatterndemo.entity.enums.AnswerStrategyEnum;
import com.robod.strategypatterndemo.strategy.answer.impl.EasyCommitAnswer;
import com.robod.strategypatterndemo.strategy.answer.impl.HardCommitAnswer;
import com.robod.strategypatterndemo.strategy.answer.impl.MediumCommitAnswer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CommitAnswerConfig
 * @Description 提交答案策略工厂类
 * @Author Robod
 * @Date 2022/10/1 15:37
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class CommitAnswerFactory {
    private static final Map<Integer, ICommitAnswer> answerStrategies = new HashMap<>();

    static {
        answerStrategies.put(AnswerStrategyEnum.EASY.getCode(), new EasyCommitAnswer());
        answerStrategies.put(AnswerStrategyEnum.MEDIUM.getCode(), new MediumCommitAnswer());
        answerStrategies.put(AnswerStrategyEnum.HARD.getCode(), new HardCommitAnswer());
    }

    public static ICommitAnswer getAnswerStrategy(Integer mode) {
        return answerStrategies.get(mode);
    }

}

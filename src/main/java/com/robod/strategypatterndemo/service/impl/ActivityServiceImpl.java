package com.robod.strategypatterndemo.service.impl;

import com.robod.strategypatterndemo.entity.req.AnswerReq;
import com.robod.strategypatterndemo.entity.req.AnswersSubmitReq;
import com.robod.strategypatterndemo.entity.res.Result;
import com.robod.strategypatterndemo.service.ActivityService;
import com.robod.strategypatterndemo.strategy.answer.CommitAnswerFactory;
import com.robod.strategypatterndemo.strategy.answer.ICommitAnswer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName ActivityServiceImpl
 * @Description
 * @Author Robod
 * @Date 2022/10/1 14:44
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Service
public class ActivityServiceImpl implements ActivityService {

    @Override
    public Result<Boolean> submitAnswers(AnswersSubmitReq req) {
        if (Objects.isNull(req.getAnswers()) || req.getAnswers().size() < 10) {
            return Result.<Boolean>fail().message("提交的答案数量有误");
        }

        List<AnswerReq> answers = req.getAnswers();
        ICommitAnswer answerStrategy = CommitAnswerFactory.getAnswerStrategy(req.getAnswerMode());
        return answerStrategy.execute(answers);
    }

    /**
     * 废弃的Step1：直接开撸
     */
//    @Override
//    public Result<Boolean> submitAnswers(AnswersSubmitReq req) {
//        if (Objects.isNull(req.getAnswers()) || req.getAnswers().size() < 10) {
//            return Result.<Boolean>fail().message("提交的答案数量有误");
//        }
//
//        int rightAnswerCount = 0;
//        for (AnswerReq answer : req.getAnswers()) {
//            // 根据题目id获取从数据库中获取正确答案。此步骤略。假定正确答案是A
//            String right = "A";
//
//            rightAnswerCount += StrUtil.equals(right, answer.getUserAnswer()) ? 1 : 0;
//        }
//
//        if (rightAnswerCount >= 6) {
//            return Result.<Boolean>success().data(true).message("闯关成功");
//        }
//        return Result.<Boolean>success().data(false).message("闯关失败");
//    }

    /**
     * 废弃的Step2：使用if...else...实现需求
     */
//    @Override
//    public Result<Boolean> submitAnswers(AnswersSubmitReq req, Integer level) {
//        if (Objects.isNull(req.getAnswers()) || req.getAnswers().size() < 10) {
//            return Result.<Boolean>fail().message("提交的答案数量有误");
//        }
//
//        if (level == 1) {
//            // 答案的判定。代码省略…………
//        } else if (level == 2) {
//            // 答案的判定。代码省略…………
//        } else if (level == 3) {
//            // 答案的判定。代码省略…………
//        }
//        return Result.<Boolean>success().data(true);
//    }

    /**
     * 策略模式优化前
     */
//    @Override
//    public Result<Boolean> submitAnswers(AnswersSubmitReq req) {
//        if (Objects.isNull(req.getAnswers()) || req.getAnswers().size() < 10) {
//            return Result.<Boolean>fail().message("提交的答案数量有误");
//        }
//
//        List<AnswerReq> answers = req.getAnswers();
//
//        if (req.getAnswerMode() == 1) {
//            ICommitAnswer answerStrategy = new EasyCommitAnswer();
//            return answerStrategy.execute(answers);
//        } else if (req.getAnswerMode() == 2) {
//            ICommitAnswer answerStrategy = new MediumCommitAnswer();
//            return answerStrategy.execute(answers);
//        } else if (req.getAnswerMode() == 3) {
//            ICommitAnswer answerStrategy = new HardCommitAnswer();
//            return answerStrategy.execute(answers);
//        }
//    }

}

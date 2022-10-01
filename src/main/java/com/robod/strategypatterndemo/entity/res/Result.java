package com.robod.strategypatterndemo.entity.res;

import com.robod.strategypatterndemo.entity.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author Robod
 * @Date 2022/10/1 13:15
 * @Version 1.0
 * @github :https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
public class Result<T> {

    private boolean flag;
    private String message;
    private String code;
    private T data;

    public Result(boolean flag) {
        this.flag = flag;
    }

    /**
     * 添加状态码
     */
    public Result<T> code(String code) {
        this.code = code;
        return this;
    }

    /**
     * 添加返回消息
     */
    public Result<T> message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 设置返回内容
     */
    public Result<T> data(T data) {
        this.data = data;
        return this;
    }

    /**
     * 业务成功
     */
    public static <T> Result<T> success() {
        Result<T> success = new Result<>(true);
        success.setCode(ResultCodeEnum.SUCCESS.getValue());
        return success;
    }

    public static <T> Result<T> fail() {
        Result<T> success = new Result<>(false);
        success.setCode(ResultCodeEnum.FAIL.getValue());
        return success;
    }

}

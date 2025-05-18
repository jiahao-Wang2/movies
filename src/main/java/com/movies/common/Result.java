package com.movies.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;//状态码 0:失败,1:成功
    private String message;//消息
    private Object data;//返回数据

    //无需返回数据的成功结果
    public static Result success() {
        return new Result(1, "success", null);
    }

    //又返回数据的成功结果
    public static Result success(Object data) {return new Result(1, "success", data);}

    //失败结果返回
    public static Result error(String message) {return new Result(0, message, null);}

}

package com.Utils;

import com.bean.model.JsonResult;

/**
 * @author Ash
 * @date 2018/7/15 10:44
 */
public class JsonGenerator {

    public static JsonResult getErrResult(String message) {
        JsonResult jsonResult = JsonResult.genJsonResult();
        jsonResult.setCode(400);
        jsonResult.setMessage(message);
        return jsonResult;
    }

    /**
     * 返回 200 json
     * @return
     */
    public static JsonResult getSuccessResult() {
        JsonResult jsonResult = JsonResult.genJsonResult();
        jsonResult.setCode(200);
        jsonResult.setMessage("请求成功");
        return jsonResult;
    }

    /**
     * 生成带数据实体的json
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> JsonResult<T> getResult(T data, String message) {
        JsonResult<T> jsonResult = JsonResult.genJsonResult();
        jsonResult.setCode(200);
        jsonResult.setData(data);
        jsonResult.setMessage(message);
        return jsonResult;
    }
}

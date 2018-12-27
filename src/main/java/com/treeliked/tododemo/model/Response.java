package com.treeliked.tododemo.model;

/**
 * 响应
 *
 * @author lqs2
 * @date 2018-12-18, Tue
 */
public class Response {

    /**
     * 查询成功消息
     */
    public static final String SUCCESS_MESSAGE = "1";

    /**
     * 查询失败信息
     */
    public static final String FAIL_MESSAGE = "0";

    /**
     * 错误消息
     */
    public static final String ERROR_MESSAGE = "-1";
    /**
     * 响应码
     */
    private ResultCode code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 其他数据
     */
    private Object data0;

    /**
     * 其他数据
     */
    private Object data1;

    public Response() {
        this.setCode(ResultCode.SUCCESS);
    }

    public Response(ResultCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultCode getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData0() {
        return data0;
    }

    public void setData0(Object data0) {
        this.data0 = data0;
    }

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public static Response getSuccessResponse() {
        return new Response(ResultCode.SUCCESS, "操作成功");
    }

    public static Response getFailResponse() {
        return new Response(ResultCode.FAIL, "操作失败");
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data0=" + data0 +
                ", data1=" + data1 +
                '}';
    }
}

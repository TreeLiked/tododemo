package com.treeliked.tododemo.config;

import com.treeliked.tododemo.model.Response;
import com.treeliked.tododemo.model.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常拦截
 *
 * @author lqs2
 * @date 2018/8/3, Fri
 */
@ControllerAdvice(basePackages = {"com.treeliked.todo.controller"})
public class GlobalExceptionHandler {

    /**
     * 日志打印
     */
    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * error page message
     */
    private static final String DEFAULT_ERROR_MESSAGE = "Sorry，something went error . . .";

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response errorHandle(HttpServletRequest request, Exception e) {

        String url = request.getRequestURL().toString();
        log.error("Access to {} occur error -> \n{}", url, e);

        Response resp = new Response();

        resp.setCode(ResultCode.INTERNAL_SERVER_ERROR);
        resp.setMessage(DEFAULT_ERROR_MESSAGE);

        resp.setData0("RequestUrl: " + request.getRequestURL().toString());
        resp.setData1("ErrorMessage: " + e.getMessage());

        return resp;
    }
}

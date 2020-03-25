package com.example.democommon.exception;


import com.example.democommon.bean.Response;
import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.List;
import java.util.Set;

/**
 * 全局异常处理类
 * @author tangyajun
 * @date 2018/9/12 下午3:42
 */
@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {
    // 记录程序异常日志
    private static final Logger LOGGER= LogManager.getLogger(GlobalExceptionHandler.class);
    //  记录业务异常日志
    private static final Logger BUSINESS_LOGGER=LogManager.getLogger(GlobalExceptionHandler.class);
    // 记录方法参数验证异常日志
    private static final Logger METHOD_ARGUMENT_VALIDATE_LOGGER=LogManager.getLogger(GlobalExceptionHandler.class);


    /**
     * 处理程序异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        if (LOGGER.isInfoEnabled()) {
	        LOGGER.info("===程序异常==",e);
        }
        LOGGER.error("程序异常",e);
        return new Response(-1,e.getMessage(),null);
    }
}

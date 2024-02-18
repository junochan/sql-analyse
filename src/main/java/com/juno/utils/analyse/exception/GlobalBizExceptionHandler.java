/*
 *    Copyright (c) 2018-2025, upip All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: upip
 */

package com.juno.utils.analyse.exception;

import com.juno.utils.analyse.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author upip
 * date: 2020-06-29
 */
@Slf4j
@RestController
@RestControllerAdvice
public class GlobalBizExceptionHandler {

    /**
     * 全局异常.
     *
     * @param e the e
     * @return R
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R handleGlobalException(Exception e) {
        log.error("全局异常信息 ex={}", e.getMessage(), e);

        return R.failed(e.getLocalizedMessage());
    }


    /**
     * validation Exception
     *
     * @param exception
     * @return R
     */
    @ExceptionHandler({BindException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public R handleBodyValidException(BindException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        // 插入log 的逻辑
        return R.failed(String.format("%s %s", fieldErrors.get(0).getField(), fieldErrors.get(0).getDefaultMessage()));
    }

    /**
     * 避免 404 重定向到 /error 导致NPE ,ignore-url 需要配置对应端点
     *
     * @return R
     */
    @DeleteMapping("/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public R noHandlerFoundException() {
        return R.failed(HttpStatus.NOT_FOUND.getReasonPhrase());
    }


}

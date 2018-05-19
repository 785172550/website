package com.demo.exception;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private Logger logger = Logger.getLogger(this.getClass());

  private static final String DEFAULT_ERROR_VIEW = "error";

  @ExceptionHandler(value = Exception.class)
  public ModelAndView defaultErrorHandler(Exception e, HttpServletRequest request) {
    logger.error(request.getRequestURL());
    logger.error("异常信息： ", e);
    ModelAndView mv = new ModelAndView();
    mv.setViewName(DEFAULT_ERROR_VIEW);
    return mv;
  }


}

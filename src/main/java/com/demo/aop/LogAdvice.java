package com.demo.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LogAdvice {

  private Logger logger = Logger.getLogger(this.getClass());


  @Before("within(com.demo..*) && @annotation(logManage)")
  public void addBeforeLog(JoinPoint joinpoint, LogManage logManage){
    logger.info("excute " + logManage.description() + " start");
    logger.info(joinpoint.getSignature().toLongString());
    logger.info(joinpoint.getArgs());
  }

  @AfterReturning("within(com.demo..*) && @annotation(logManage)")
  public void addAfterLog(JoinPoint joinPoint, LogManage logManage){
    logger.info("excute " + logManage.description() + " end");
  }
  @AfterThrowing(pointcut = "within(com.demo..*) && @annotation(logManage)",throwing = "ex")
  public void addThrowingLog(JoinPoint joinPoint, LogManage logManage, Exception ex){
    logger.error("excute " + logManage.description() +" exception" ,ex);
  }

}

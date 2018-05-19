package com.demo.aop;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogManageBefore {
  public String description() default "";
}

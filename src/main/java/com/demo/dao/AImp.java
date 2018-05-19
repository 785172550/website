package com.demo.dao;

import org.springframework.stereotype.Component;

@Component("Imp")
public class AImp implements Ainterface {

  @Override
  public void fun() {
    System.out.println("hahahha");
  }
}

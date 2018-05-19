package com.demo.controller;

import com.demo.aop.LogManage;
import com.demo.dao.DemoRepository;
import com.demo.domain.Results;
import com.demo.domain.model.User;
import java.util.Date;
import javax.naming.Name;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

  @Autowired
  DemoRepository demoRepository;

  @LogManage(description = "test controller")
  @RequestMapping("/name/{index}")
  public String getName(@PathVariable String index) {
    return "kenneth: " + index;
  }

  @LogManage
  @RequestMapping("/date")
  public String getDate() {
    return new Date().toString();
  }

  @RequestMapping("/result/{name}")
  public Object setUser(@PathVariable String name){
    Results results = new Results(1L,name,"testname");
    demoRepository.save(results);
    return results;
  }
}

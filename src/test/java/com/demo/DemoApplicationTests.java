package com.demo;

import com.demo.aop.LogManage;
import com.demo.dao.Ainterface;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  @Qualifier("Imp")
  @Autowired
  private Ainterface ainterface;

  @LogManage(description = "test context")
  @Test
  public void contextLoads() {
    Assert.assertEquals(1, 1);
  }

  @Test
  public void testInterface() { // 使用的是接口，但注入实现类
    ainterface.fun();
  }

}

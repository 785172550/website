package com.demo.dao;

import com.demo.domain.Results;


import com.demo.domain.model.Item;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

  @Autowired
  private DemoRepository demoRepository;

  @Autowired
  private SecKillRepository secKillRepository;

  @Test
  public void testSave() {

    Results results = new Results(1L, "kenneth", "content");
    demoRepository.save(results);
    Assert.assertEquals(demoRepository.getNameById(1L), "kenneth");
  }

  @Test
  public void saveItem(){
    Item item = new Item(1L,"显示器","戴尔",1,new Date(),new Date(), new Date());
    secKillRepository.save(item);
    Item item1 = secKillRepository.findOne(1L);
    Assert.assertEquals(new Long(1L),item1.getId());
  }


}

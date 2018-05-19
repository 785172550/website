package com.demo.domain.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Item {

  @javax.persistence.Id
  @GeneratedValue
  private Long Id;
  private String name;
  private String content;
  private int number;
  private Date createTime;
  private Date startTime;
  private Date endTime;
}

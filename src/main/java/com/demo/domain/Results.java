package com.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Log4j
@Data
@Entity
public class Results {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;
  private String name;
  private String content;
}

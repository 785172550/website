package com.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SecKillRes<T> {

  private String code;
  private String name;
  private T content;

}

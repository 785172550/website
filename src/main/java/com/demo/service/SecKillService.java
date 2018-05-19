package com.demo.service;

import com.demo.dao.SecKillRepository;
import com.demo.domain.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SecKillService {

  @Autowired
  SecKillRepository repository;

  public Item getById(Long Id) {
    return repository.findOne(Id);
  }

}

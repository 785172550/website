package com.demo.dao;

import com.demo.domain.Results;
import com.demo.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecKillRepository extends JpaRepository<Item,Long> {

}

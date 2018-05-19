package com.demo.dao;


import com.demo.domain.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Results,Long>{

  @Query(value = "select r.name from Results r where r.id = ?1",nativeQuery = true)
  String getNameById(@Param("id") Long id);
}

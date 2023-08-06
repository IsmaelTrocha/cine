package com.cineworld.cw.infrastructure.repository.customer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto, Long> {

  @Query(value = "SELECT C FROM CustomerDto C WHERE c.name LIKE %:first_name%")
  List<CustomerDto> findAllByName(@Param("first_name") String firstName);
}

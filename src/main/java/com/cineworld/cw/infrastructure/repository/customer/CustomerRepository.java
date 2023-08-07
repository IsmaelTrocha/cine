package com.cineworld.cw.infrastructure.repository.customer;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto, Long> {

  @Query("SELECT c FROM CustomerDto c WHERE c.firstName LIKE %:firstName%")
  List<CustomerDto> findByFirstName(@Param("firstName") String firstName);

}

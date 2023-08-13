package com.cineworld.cw.infrastructure.repository.customer;

import com.cineworld.cw.domain.entities.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto, Long> {

  @Query("SELECT c FROM CustomerDto c WHERE c.firstName LIKE %:firstName%")
  List<CustomerDto> findByFirstName(@Param("firstName") String firstName);

  @Query("UPDATE c SET first_name=:firstName")
  Customer updateCustomer(
      @Param("firstName") String firstName,
      @Param("secondName") String secondName,
      @Param("firstSurname") String firstSurname,
      @Param("secondSurname") String secondSurname);


}

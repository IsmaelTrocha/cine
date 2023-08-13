package com.cineworld.cw.infrastructure.repository.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class CustomerDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "second_name")
  private String secondName;
  @Column(name = "first_surname")
  private String firstSurname;
  @Column(name = "second_surname")
  private String secondSurname;
  private String email;
  private boolean active;
  @Column(name = "create_at")
  private String createAt;
  @Column(name = "creation_date")
  private LocalDateTime creationDate;
  @Column(name = "update_at")
  private String updateAt;
  @Column(name = "update_date")
  private LocalDateTime updateDate;
}

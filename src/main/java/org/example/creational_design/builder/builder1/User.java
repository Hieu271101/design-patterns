package org.example.creational_design.builder.builder1;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private String firstName;
  private String lastName;
  private LocalDate birthday;
  private Address address;
}

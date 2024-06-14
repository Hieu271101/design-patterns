package org.example.creational_design.builder.builder1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserWebDTO implements UserDTO {

  private String name;

  private String address;

  private String age;
}

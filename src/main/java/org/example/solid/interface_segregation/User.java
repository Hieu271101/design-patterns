package org.example.solid.interface_segregation;

import java.time.LocalDateTime;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class User extends Entity {
  private String name;
  private LocalDateTime lastLogin;
}

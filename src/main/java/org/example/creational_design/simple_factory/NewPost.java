package org.example.creational_design.simple_factory;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewPost extends Post {
  private String headline;
  private LocalDate newsTime;
}

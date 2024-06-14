package org.example.creational_design.simple_factory;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Post {
  private Long id;
  private String title;
  private String content;
  private LocalDateTime createdOn;
  private LocalDateTime publishedOn;
}

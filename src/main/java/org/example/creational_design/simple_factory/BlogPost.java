package org.example.creational_design.simple_factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogPost extends Post {
  private String author;
  private String[] tags;
}

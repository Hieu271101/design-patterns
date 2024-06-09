package org.example.solid.liskov_substituition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Rectangle implements Shape {
  private int width;
  private int height;

  public int computeArea() {
    return width * height;
  }
}

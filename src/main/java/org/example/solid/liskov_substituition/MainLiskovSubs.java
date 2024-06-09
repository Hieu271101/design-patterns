package org.example.solid.liskov_substituition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainLiskovSubs {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 20);
    log.info("{}", rectangle.computeArea());
    Square square = new Square(10);
    log.info("{}", square.computeArea());

    useRectangle(rectangle);
  }

  private static void useRectangle(Rectangle rectangle) {
    rectangle.setWidth(20);
    rectangle.setWidth(30);
    assert rectangle.getHeight() == 20 : "height Not equal to 20";
    assert rectangle.getWidth() == 30 : "Width Not equal to 30";
  }
}

package org.example.creational_design.object_pool;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bitmap implements Image {
  private Point2D location;
  private final String name;

  public Bitmap(String name) {
    this.name = name;
  }

  @Override
  public void draw() {
    log.info("Drawing " + name + " @" + location);
  }

  @Override
  public Point2D getLocation() {
    return location;
  }

  @Override
  public void setLocation(Point2D location) {
    this.location = location;
  }

  @Override
  public void reset() {
    location = null;
    log.info("Bitmap is reset");
  }
}

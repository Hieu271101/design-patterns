package org.example.creational_design.object_pool;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
  public static final ObjectPool<Bitmap> bitmapPool =
      new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

  public static void main(String[] args) {
    Bitmap b1 = bitmapPool.get();
    b1.setLocation(new Point2D(10, 10));
    Bitmap b2 = bitmapPool.get();
    b2.setLocation(new Point2D(-10, 0));

    b1.draw();

    log.info("{}", b1.getLocation());
    b2.draw();
    log.info("{}", b2.getLocation());
    bitmapPool.release(b1);
    bitmapPool.release(b2);
  }
}

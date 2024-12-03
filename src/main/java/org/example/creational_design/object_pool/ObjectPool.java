package org.example.creational_design.object_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObjectPool<T extends Poolable> {
  private final BlockingQueue<T> availablePool;

  public ObjectPool(Supplier<T> creator, int count) {
    availablePool = new LinkedBlockingQueue<>();
    for (int i = 0; i < count; i++) {
      if (availablePool.offer(creator.get())) {
        log.info("Getting....");
      } else {
        log.error("Error....");
      }
    }
  }

  public T get() {
    try {
      return availablePool.take();
    } catch (InterruptedException ex) {
      log.info("Take() was interrupted");
      Thread.currentThread().interrupt();
    }
    return null;
  }

  public void release(T obj) {
    obj.reset();
    try {
      availablePool.put(obj);
    } catch (InterruptedException e) {
      log.error("Put() was interrupted");
      Thread.currentThread().interrupt();
    }
  }
}

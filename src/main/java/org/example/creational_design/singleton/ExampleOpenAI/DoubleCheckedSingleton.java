package org.example.creational_design.singleton.ExampleOpenAI;

public class DoubleCheckedSingleton {
  private static volatile DoubleCheckedSingleton instance;

  private DoubleCheckedSingleton() {}

  public static DoubleCheckedSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckedSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckedSingleton();
        }
      }
    }
    return instance;
  }
}

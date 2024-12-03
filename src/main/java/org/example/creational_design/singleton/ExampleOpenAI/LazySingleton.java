package org.example.creational_design.singleton.ExampleOpenAI;

public class LazySingleton {
  private static LazySingleton instance;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}

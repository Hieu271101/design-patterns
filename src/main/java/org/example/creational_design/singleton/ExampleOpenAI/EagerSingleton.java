package org.example.creational_design.singleton.ExampleOpenAI;

import lombok.Getter;

public class EagerSingleton {
  @Getter private static final EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {}
}

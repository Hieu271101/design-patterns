package org.example.creational_design.factory_method.exampleOpenAI;

public class Bike implements Transport {
  @Override
  public void deliver() {
    System.out.println("Delivering by Bike");
  }
}

package org.example.creational_design.factory_method.exampleOpenAI;

public class CarFactory extends TransportFactory {
  @Override
  public Transport createTransport() {
    return new Car();
  }
}

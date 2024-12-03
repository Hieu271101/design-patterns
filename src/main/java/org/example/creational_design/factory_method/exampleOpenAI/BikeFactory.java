package org.example.creational_design.factory_method.exampleOpenAI;

public class BikeFactory extends TransportFactory {
  @Override
  public Transport createTransport() {
    return new Bike();
  }
}

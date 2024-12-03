package org.example.creational_design.factory_method.exampleOpenAI;

public class Main {
  public static void main(String[] args) {
    TransportFactory car = new CarFactory();
    car.startDelivery();

    TransportFactory bike = new BikeFactory();
    bike.startDelivery();
  }
}

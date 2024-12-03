package org.example.creational_design.factory_method.exampleOpenAI;

public abstract class TransportFactory {
  public abstract Transport createTransport();

  public void startDelivery() {
    Transport transport = createTransport();
    transport.deliver();
  }
}

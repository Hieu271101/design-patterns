package org.example.creational_design.factory_method.message;

public abstract class Message {
  public abstract String getContent();

  public void addDefaultHeaders() {}

  public void encrypt() {}
}

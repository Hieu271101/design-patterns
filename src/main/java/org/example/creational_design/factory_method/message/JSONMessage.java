package org.example.creational_design.factory_method.message;

public class JSONMessage extends Message {

  @Override
  public String getContent() {
    return "{\"JSON]\":[]}";
  }
}

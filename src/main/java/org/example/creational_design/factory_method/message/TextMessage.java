package org.example.creational_design.factory_method.message;

public class TextMessage extends Message {
  @Override
  public String getContent() {
    return "Text";
  }
}

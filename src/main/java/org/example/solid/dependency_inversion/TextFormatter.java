package org.example.solid.dependency_inversion;

@SuppressWarnings("unused")
public class TextFormatter implements Formatter {
  public String format(Message message) {
    return message.getTimestamp() + ":" + message.getMsg();
  }
}

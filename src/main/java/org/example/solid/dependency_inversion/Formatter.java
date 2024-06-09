package org.example.solid.dependency_inversion;

public interface Formatter {
  String format(Message message) throws FormatException;
}

package org.example.solid.dependency_inversion;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainDependencyInversion {
  public static void main(String[] args) throws FormatException {
    Message msg = new Message("This is a message again");
    MessagePrinter printer = new MessagePrinter();
    try {
      StringWriter stringWriter = new StringWriter();
      PrintWriter writer = new PrintWriter(stringWriter);
      printer.writeMessage(msg, new JSONFormatter(), writer);
      log.info(stringWriter.toString());
    } catch (IOException e) {
      throw new FormatException(e);
    }
  }
}

package org.example.creational_design.factory_method;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.factory_method.message.Message;

@Slf4j
public class Client {
  public static void main(String[] args) {
    printMessage(new JSONMessageCreator());
    printMessage(new TextMessageCreator());
  }

  public static void printMessage(MessageCreator creator) {
    Message msg = creator.getMessage();
    log.info("{}", msg);
  }
}

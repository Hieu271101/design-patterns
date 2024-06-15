package org.example.creational_design.factory_method;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.factory_method.message.Message;

@Slf4j
public abstract class MessageCreator {
  public Message getMessage() {
    Message msg = createMessage();

    msg.addDefaultHeaders();
    msg.encrypt();
    log.info("{}", msg.getContent());
    return msg;
  }

  // Factory Method
  public abstract Message createMessage();
}

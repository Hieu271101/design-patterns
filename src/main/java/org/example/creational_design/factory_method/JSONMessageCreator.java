package org.example.creational_design.factory_method;

import org.example.creational_design.factory_method.message.JSONMessage;
import org.example.creational_design.factory_method.message.Message;

public class JSONMessageCreator extends MessageCreator {

  @Override
  public Message createMessage() {
    JSONMessage msg = new JSONMessage();
    msg.getContent();
    return new JSONMessage();
  }
}

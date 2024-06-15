package org.example.creational_design.factory_method;

import org.example.creational_design.factory_method.message.Message;
import org.example.creational_design.factory_method.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

  @Override
  public Message createMessage() {
    TextMessage txtMsg = new TextMessage();
    txtMsg.getContent();
    return new TextMessage();
  }
}

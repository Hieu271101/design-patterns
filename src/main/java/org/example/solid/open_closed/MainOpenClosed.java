package org.example.solid.open_closed;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainOpenClosed {
  public static void main(String[] args) {
    Subscriber phoneSubscriber = new PhoneSubscriber(123L, "Abc", 12345L, 1);
    Subscriber ipSubscriber = new IPSubscriber(123L, "Abc", 12345L, 1, 1213L);
    log.info("{}", phoneSubscriber.calculateBill());
    log.info("{}", ipSubscriber.calculateBill());
  }
}

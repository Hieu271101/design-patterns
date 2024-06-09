package org.example.solid.open_closed;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PhoneSubscriber extends Subscriber {
  public PhoneSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
    super(subscriberId, address, phoneNumber, baseRate);
  }

  @Override
  public long calculateBill() {
    List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
    long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
    return totalDuration * baseRate / 100;
  }
}

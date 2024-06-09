package org.example.solid.open_closed;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("unused")
public class IPSubscriber extends Subscriber {

  private long freeUsage;

  public IPSubscriber(
      Long subscriberId, String address, Long phoneNumber, int baseRate, Long freeUsage) {
    super(subscriberId, address, phoneNumber, baseRate);
    this.freeUsage = freeUsage != null ? freeUsage : 0;
  }

  @Override
  public long calculateBill() {
    List<InternetSessionHistory.InternetSession> sessions =
        InternetSessionHistory.getCurrentSessions(subscriberId);
    long totalData =
        sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
    long chargeableData = totalData - freeUsage;
    if (chargeableData <= 0) {
      return 0;
    }
    return chargeableData * baseRate / 100;
  }
}

package org.example.solid.open_closed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Subscriber {
  protected Long subscriberId;
  protected String address;
  protected Long phoneNumber;
  protected int baseRate;

  public abstract long calculateBill();
}

package org.example.solid.interface_segregation;

import java.time.LocalDateTime;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Order extends Entity {
  private LocalDateTime orderPlacedOn;
  private double totalValue;
}

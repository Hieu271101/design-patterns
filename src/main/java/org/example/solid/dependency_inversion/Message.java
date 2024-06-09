package org.example.solid.dependency_inversion;

import java.time.LocalDateTime;
import java.time.ZoneId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
  private String msg;
  private LocalDateTime timestamp;

  public Message(String msg) {
    this.msg = msg;
    this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
  }
}

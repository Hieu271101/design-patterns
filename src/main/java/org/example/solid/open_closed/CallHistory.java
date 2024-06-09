package org.example.solid.open_closed;

import java.time.LocalDateTime;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class CallHistory {

  @Getter
  @Setter
  @AllArgsConstructor
  public static class Call {
    private Long subscriberId;

    private LocalDateTime begin;

    private long duration;
  }

  private CallHistory() {
    throw new UnsupportedOperationException("This is utility class and can not be instantiated");
  }

  private static final Map<Long, List<Call>> CALLS = new HashMap<>();

  public static synchronized List<Call> getCurrentCalls(Long subscriberId) {
    if (!CALLS.containsKey(subscriberId)) {
      return Collections.emptyList();
    }
    return CALLS.get(subscriberId);
  }

  @SuppressWarnings("unused")
  public static synchronized void addSession(
      Long subscriberId, LocalDateTime begin, long duration) {
    List<Call> calls;
    if (!CALLS.containsKey(subscriberId)) {
      calls = new LinkedList<>();
      CALLS.put(subscriberId, calls);
    } else {
      calls = CALLS.get(subscriberId);
    }
    calls.add(new Call(subscriberId, begin, duration));
  }
}

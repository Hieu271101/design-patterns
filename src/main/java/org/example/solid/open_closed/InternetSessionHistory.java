package org.example.solid.open_closed;

import java.time.LocalDateTime;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class InternetSessionHistory {
  @Getter
  @Setter
  @AllArgsConstructor
  public static class InternetSession {
    private Long subscriberId;
    private LocalDateTime begin;
    private Long dataUsed;
  }

  private InternetSessionHistory() {
    throw new UnsupportedOperationException("This is utility class and can not be instantiated");
  }

  private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

  public static synchronized List<InternetSession> getCurrentSessions(Long subscriberId) {
    if (!SESSIONS.containsKey(subscriberId)) {
      return Collections.emptyList();
    }
    return SESSIONS.get(subscriberId);
  }

  @SuppressWarnings("unused")
  public static synchronized void addSession(
      Long subscriberId, LocalDateTime begin, long dataUsed) {
    List<InternetSession> sessions;
    if (!SESSIONS.containsKey(subscriberId)) {
      sessions = new LinkedList<>();
      SESSIONS.put(subscriberId, sessions);
    } else {
      sessions = SESSIONS.get(subscriberId);
    }
    sessions.add(new InternetSession(subscriberId, begin, dataUsed));
  }
}

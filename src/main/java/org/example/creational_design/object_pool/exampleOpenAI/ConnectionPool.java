package org.example.creational_design.object_pool.exampleOpenAI;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
  private List<Connection> pool;
  private final int MAX_POOL_SIZE = 10;

  public ConnectionPool() {
    pool = new ArrayList<>();
    for (int i = 0; i < MAX_POOL_SIZE; i++) {
      pool.add(new Connection());
    }
  }

  public Connection accquireConnection() {
    for (Connection connection : pool) {
      if (!connection.isInUse()) {
        connection.setInUse(true);
        return connection;
      }
    }
    return null;
  }

  public void releaseConnection(Connection connection) {
    connection.setInUse(false);
    connection.disconnect();
  }
}

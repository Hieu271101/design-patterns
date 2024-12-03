package org.example.creational_design.object_pool.exampleOpenAI;

public class Connection {
  private boolean inUse;

  public Connection() {
    inUse = false;
  }

  public boolean isInUse() {
    return inUse;
  }

  public void setInUse(boolean inUse) {
    this.inUse = inUse;
  }

  public void connect() {
    System.out.println("Connected");
  }

  public void disconnect() {
    System.out.println("Disconnected");
  }
}

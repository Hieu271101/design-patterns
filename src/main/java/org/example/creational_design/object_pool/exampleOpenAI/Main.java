package org.example.creational_design.object_pool.exampleOpenAI;

public class Main {
  public static void main(String[] args) {
    ConnectionPool pool = new ConnectionPool();
    Connection connection1 = pool.accquireConnection();
    Connection connection2 = pool.accquireConnection();
    Connection connection3 = pool.accquireConnection();

    pool.releaseConnection(connection1);
    pool.releaseConnection(connection2);
    pool.releaseConnection(connection3);
  }
}

package org.example.solid.interface_segregation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class OrderPersistenceService implements PersistenceService<Order> {
  private static final Map<Long, Order> ORDERS = new HashMap<>();

  @Override
  public void save(Order entity) {
    synchronized (ORDERS) {
      ORDERS.put(entity.getId(), entity);
    }
  }

  @Override
  public void delete(Order entity) {
    ORDERS.remove(entity.getId());
  }

  @Override
  public Order findById(Long id) {

    synchronized (ORDERS) {
      return ORDERS.get(id);
    }
  }

  @Override
  public List<Order> findByName(String name) {
    throw new UnsupportedOperationException("Find by name is not supported");
  }
}

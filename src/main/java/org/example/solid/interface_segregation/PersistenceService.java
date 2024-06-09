package org.example.solid.interface_segregation;

import java.util.List;

@SuppressWarnings("unused")
public interface PersistenceService<T extends Entity> {
  void save(T entity);

  void delete(T entity);

  T findById(Long id);

  List<T> findByName(String name);
}

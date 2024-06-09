package org.example.solid.single_responsibility;

public class UserPersistenceService {
  private final Store store = new Store();

  public void saveUser(User user) {
    store.store(user);
  }
}

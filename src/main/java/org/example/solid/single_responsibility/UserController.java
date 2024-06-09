package org.example.solid.single_responsibility;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class UserController {
  private final UserPersistenceService service = new UserPersistenceService();

  public String createUser(String userJson) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    User user = mapper.readValue(userJson, User.class);
    UserValidator validator = new UserValidator();
    boolean valid = validator.validateUser(user);
    if (!valid) {
      return "ERROR";
    }
    service.saveUser(user);
    return "SUCCESS";
  }
}

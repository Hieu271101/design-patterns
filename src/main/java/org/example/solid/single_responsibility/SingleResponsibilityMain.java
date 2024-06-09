package org.example.solid.single_responsibility;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleResponsibilityMain {

  private static final String VALID_USER_JSON = "{}";
  private static final String INVALID_USER_JSON = "{}";

  public static void main(String[] args) throws IOException {
    UserController controller = new UserController();
    String response = controller.createUser(VALID_USER_JSON);
    if (!response.equalsIgnoreCase("SUCCESS")) {
      log.error("FAIL");
    }
    log.info("Valid JSON received response: {}", response);
    response = controller.createUser(INVALID_USER_JSON);
    if (!response.equalsIgnoreCase("ERROR")) {
      log.error("Fail");
    }
    log.info("Invalid JSON received response: " + response);
  }
}

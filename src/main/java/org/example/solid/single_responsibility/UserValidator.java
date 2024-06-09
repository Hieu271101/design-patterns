package org.example.solid.single_responsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
  public boolean validateUser(User user) {
    return isValidUser(user);
  }

  private boolean isValidUser(User user) {
    if (!isPresent(user.getName())) {
      return false;
    }
    user.setName(user.getName());
    if (!isValidAlphaNumeric(user.getName())) {
      return false;
    }
    if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
      return false;
    }
    user.setEmail(user.getEmail());
    return true;
  }

  private boolean isPresent(String value) {
    return value != null && !value.trim().isEmpty();
  }

  private boolean isValidAlphaNumeric(String value) {
    Pattern pattern = Pattern.compile("[A-Za-z0-9]");
    Matcher matcher = pattern.matcher(value);
    return !matcher.find();
  }
}

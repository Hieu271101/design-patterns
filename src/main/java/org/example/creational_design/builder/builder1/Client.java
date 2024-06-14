package org.example.creational_design.builder.builder1;

import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

  public static void main(String[] args) {
    User user = createUser();
    UserDTOBuilder builder = new UserWebDTOBuilder();

    // Client has to provide director with concrete builder
    UserDTO dto = directBuild(builder, user);
    log.info("user Builder DTO: {}", builder.getUserDTO());
    log.info("{}", dto);
  }

  /** This method serves the role of director in builder pattern. */
  private static UserDTO directBuild(UserDTOBuilder builder, User user) {
    return builder
        .withFirstName(user.getFirstName())
        .withLastName(user.getLastName())
        .withAddress(user.getAddress())
        .withBirthday(user.getBirthday())
        .build();
  }

  /** Returns a sample user. */
  public static User createUser() {
    User user = new User();
    user.setBirthday(LocalDate.of(1960, 5, 6));
    user.setFirstName("Ron");
    user.setLastName("Swanson");
    Address address = new Address();
    address.setHouseNumber("100");
    address.setStreet("State Street");
    address.setCity("Pawnee");
    address.setState("Indiana");
    address.setZipcode("47998");
    user.setAddress(address);

    return user;
  }
}
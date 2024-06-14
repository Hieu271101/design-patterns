package org.example.creational_design.builder.builder2;

import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.builder.builder1.Address;
import org.example.creational_design.builder.builder1.User;

@Slf4j
public class Client {
  public static void main(String[] args) {
    User user = createUser();
    UserDTO dto = directBuild(UserDTO.getBuilder(), user);
    log.info("{}", dto);
  }

  private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
    return builder
        .withFirstName(user.getFirstName())
        .withLastName(user.getLastName())
        .withAddress(user.getAddress())
        .withBirthday(user.getBirthday())
        .build();
  }

  public static User createUser() {
    User user = new User();
    user.setBirthday(LocalDate.of(1960, 6, 5));
    user.setFirstName("Ron");
    user.setLastName("Swanson");
    Address address = new Address();
    address.setHouseNumber("123");
    address.setStreet("State Street");
    address.setCity("Pawnee");
    address.setState("Indiana");
    address.setZipcode("123");
    user.setAddress(address);
    return user;
  }
}

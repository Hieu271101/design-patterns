package org.example.creational_design.builder.builder2;

import java.time.LocalDate;
import java.time.Period;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.creational_design.builder.builder1.Address;

@Getter
@Setter
@ToString
public class UserDTO {
  private String name;
  private String address;
  private String age;

  public static UserDTOBuilder getBuilder() {
    return new UserDTOBuilder();
  }

  public static class UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    @Getter private UserDTO userDTO;

    public UserDTOBuilder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public UserDTOBuilder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public UserDTOBuilder withBirthday(LocalDate date) {
      this.age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
      return this;
    }

    public UserDTOBuilder withAddress(Address address) {
      this.address = address.getHouseNumber();
      return this;
    }

    public UserDTO build() {
      this.userDTO = new UserDTO();
      userDTO.setName(firstName + " " + lastName);
      userDTO.setAddress(address);
      userDTO.setAge(age);
      return this.userDTO;
    }
  }
}

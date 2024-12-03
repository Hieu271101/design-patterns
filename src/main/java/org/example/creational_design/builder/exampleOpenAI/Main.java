package org.example.creational_design.builder.exampleOpenAI;

public class Main {
  public static void main(String[] args) {
    House house1 = new House.HouseBuilder(2).setGarage(true).build();
  }
}

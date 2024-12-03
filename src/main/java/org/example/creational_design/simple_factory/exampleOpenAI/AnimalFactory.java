package org.example.creational_design.simple_factory.exampleOpenAI;

public class AnimalFactory {
  public static Animal craeteAnimal(String type) {
    if (type.equals("Dog")) {
      return new Dog();
    } else if (type.equals("Cat")) {
      return new Cat();
    }
    return null;
  }
}

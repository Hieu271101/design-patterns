package org.example.creational_design.simple_factory.exampleOpenAI;

public class Main {
  public static void main(String[] args) {
    Animal animal = AnimalFactory.craeteAnimal("Dog");
    animal.speak();

    Animal animal1 = AnimalFactory.craeteAnimal("Cat");
    animal1.speak();
  }
}

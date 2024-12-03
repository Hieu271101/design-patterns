package org.example.creational_design.abstract_factory.exampleOpeanAI;

public class LandAnimalFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Dog();
  }

  @Override
  public Habitat createHabitat() {
    return new Land();
  }
}

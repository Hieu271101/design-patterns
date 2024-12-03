package org.example.creational_design.abstract_factory.exampleOpeanAI;

public class WaterAnimalFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Shark();
  }

  @Override
  public Habitat createHabitat() {
    return new Water();
  }
}

package org.example.creational_design.abstract_factory.exampleOpeanAI;

public class ReptileAnimalFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Reptile();
  }

  @Override
  public Habitat createHabitat() {
    return new Land();
  }
}

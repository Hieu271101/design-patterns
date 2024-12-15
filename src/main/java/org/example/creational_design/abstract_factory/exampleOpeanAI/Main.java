package org.example.creational_design.abstract_factory.exampleOpeanAI;

public class Main {
  public static void main(String[] args) {
    AnimalFactory animalFactory = new LandAnimalFactory();
    animalFactory.createAnimal().speak();
    animalFactory.createHabitat().location();

    AnimalFactory animalFactory1 = new WaterAnimalFactory();
    animalFactory1.createAnimal().speak();

    AnimalFactory animalFactory2 = new ReptileAnimalFactory();
    animalFactory2.createAnimal().speak();
  }
}

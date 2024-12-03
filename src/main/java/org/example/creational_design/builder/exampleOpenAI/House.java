package org.example.creational_design.builder.exampleOpenAI;

public class House {
  private int floor;
  private boolean hasGarage;
  private boolean hasSwimmingPool;
  private boolean hasGarden;

  private House(HouseBuilder builder) {
    this.floor = builder.floor;
    this.hasGarage = builder.hasGarage;
    this.hasSwimmingPool = builder.hasSwimmingPool;
    this.hasGarden = builder.hasGarden;
  }

  public static class HouseBuilder {
    private int floor;
    private boolean hasSwimmingPool;
    private boolean hasGarage;
    private boolean hasGarden;

    public HouseBuilder(int floor) {
      this.floor = floor;
    }

    public HouseBuilder setGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return this;
    }

    public House build() {
      return new House(this);
    }
  }
}

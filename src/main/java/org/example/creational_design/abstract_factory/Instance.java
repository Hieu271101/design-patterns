package org.example.creational_design.abstract_factory;

public interface Instance {
    enum Capacity{MICRO, SMALL, LARGE}
    void start();
    void attachStorage(Storage storage);
    void stop();

}

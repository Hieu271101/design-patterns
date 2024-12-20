package org.example.creational_design.abstract_factory;

public interface ResourceFactory {
  Instance createInstance(Instance.Capacity capacity);

  Storage createStorage(int capMib);
}

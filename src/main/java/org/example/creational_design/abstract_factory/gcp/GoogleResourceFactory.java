package org.example.creational_design.abstract_factory.gcp;

import org.example.creational_design.abstract_factory.Instance;
import org.example.creational_design.abstract_factory.ResourceFactory;
import org.example.creational_design.abstract_factory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
  @Override
  public Instance createInstance(Instance.Capacity capacity) {
    return new GoogleComputeEngineInstance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new GoogleCloudStorage(capMib);
  }
}

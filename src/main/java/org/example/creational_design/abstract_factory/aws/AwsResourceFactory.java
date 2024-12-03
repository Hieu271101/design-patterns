package org.example.creational_design.abstract_factory.aws;

import org.example.creational_design.abstract_factory.Instance;
import org.example.creational_design.abstract_factory.Instance.Capacity;
import org.example.creational_design.abstract_factory.ResourceFactory;
import org.example.creational_design.abstract_factory.Storage;

public class AwsResourceFactory implements ResourceFactory {
  @Override
  public Instance createInstance(Capacity capacity) {
    return new Ec2Instance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new S3Storage(capMib);
  }
}

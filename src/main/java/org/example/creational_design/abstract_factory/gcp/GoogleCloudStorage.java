package org.example.creational_design.abstract_factory.gcp;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.abstract_factory.Storage;

@Slf4j
public class GoogleCloudStorage implements Storage {
  public GoogleCloudStorage(int capacityInMib) {
    log.info("Allocated " + capacityInMib + " on Google Cloud Storage");
  }

  @Override
  public String getId() {
    return "Google cloud cs1";
  }

  @Override
  public String toString() {
    return "Google cloud storage";
  }
}

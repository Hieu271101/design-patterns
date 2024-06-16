package org.example.creational_design.abstract_factory.gcp;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.abstract_factory.Instance;
import org.example.creational_design.abstract_factory.Storage;

@Slf4j
public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(Capacity capacity){
        log.info("Created Google Compute Engine instance with capacity: {}", capacity);
    }
    @Override
    public void start(){
        log.info("Compute engine instance started");
    }
    @Override
    public void attachStorage(Storage storage){
        log.info("Attach " +storage + " to Compute engine instance");
    }
    @Override
    public void stop(){
        log.info("Compute engine instance stopped");
    }
}

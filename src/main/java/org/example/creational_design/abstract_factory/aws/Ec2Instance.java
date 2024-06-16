package org.example.creational_design.abstract_factory.aws;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.abstract_factory.Instance;
import org.example.creational_design.abstract_factory.Storage;

@Slf4j
public class Ec2Instance implements Instance {
    public Ec2Instance(Capacity capacity){
        log.info("Created Ec2Instance with capacity: {}", capacity);
    }
    @Override
    public void start(){
        log.info("Ec2Instance started");
    }
    @Override
    public void attachStorage(Storage storage){
        log.info("Attach "+ storage+" to Ec2Instance");
    }
    @Override
    public void stop(){
        log.info("Ec2Instance stopped");
    }
    @Override
    public String toString(){
        return "Ec2Instance";
    }
}

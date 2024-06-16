package org.example.creational_design.abstract_factory.aws;

import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.abstract_factory.Storage;

@Slf4j
public class S3Storage implements Storage {
    public S3Storage(int capacityInMib){
        log.info("Allocated "+ capacityInMib + " on S3");
    }
    @Override
    public String getId(){
        return "S31";
    }
    @Override
    public String toString(){
        return "S3 Storage";
    }
}

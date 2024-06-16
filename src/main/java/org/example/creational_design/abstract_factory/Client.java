package org.example.creational_design.abstract_factory;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.creational_design.abstract_factory.aws.AwsResourceFactory;
import org.example.creational_design.abstract_factory.gcp.GoogleResourceFactory;

@AllArgsConstructor
@Slf4j
public class Client {
    private ResourceFactory factory;
    public Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        log.info("{}", storage.getId());
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.MICRO, 20480);
        i1.start();
        i1.stop();

        log.info("---------------------------------------------------");
        Client gcp = new Client(new GoogleResourceFactory());
        i1 = gcp.createServer(Instance.Capacity.MICRO, 20480);
        i1.start();
        i1.stop();
    }
}

package org.example.structural_design.Facade.OpenAI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VideoLoader {
    public void load(String fileName){
        log.info("Loading video file: {}", fileName);
    }
}

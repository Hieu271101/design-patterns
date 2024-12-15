package org.example.structural_design.Facade.OpenAI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VideoDecoder {
    public void decode(String fileName){
        log.info("Loading video file: {}", fileName);
    }
}

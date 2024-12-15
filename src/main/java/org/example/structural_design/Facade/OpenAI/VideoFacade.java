package org.example.structural_design.Facade.OpenAI;

public class VideoFacade {
    VideoLoader loader;
    VideoDecoder decoder;
    VideoPlayer player;
    public void playVideo(String fileName){
        loader.load(fileName);
        decoder.decode(fileName);
        player.play(fileName);
    }
}

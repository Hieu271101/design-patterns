package org.example.structural_design.Facade.OpenAI;

public class Main {
    public static void main(String[] args) {
        VideoFacade videoFacade = new VideoFacade();
        videoFacade.playVideo("example.mp4");
    }
}

package org.example.structural_design.Adapter.exampleOpenAI;

public class AdvancedMediaPlayer {
  public void playVlc(String fileName) {
    System.out.println("Play file " + fileName);
  }

  public void playMp4(String fileName) {
    System.out.println("Play mp4 file: " + fileName);
  }
}

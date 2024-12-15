package org.example.structural_design.Bridge.OpenAIExample;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10,20,15, new WindowDrawAPI());
        circle.draw();

        Shape circleLinux = new Circle(10,25,12, new LinuxDrawAPI());
        circleLinux.draw();
    }
}

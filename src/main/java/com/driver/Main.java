package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(30, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        mercedes.steer(90);
        mercedes.stop();

    }
}
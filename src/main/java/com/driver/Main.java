package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(10, 45);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

    }
}
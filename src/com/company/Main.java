package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Motorbike();
        vehicle.speedUP();
        System.out.println("Motocykl pędzi z prędkością: " + vehicle.getSpeed() + " km/h");
    }
}

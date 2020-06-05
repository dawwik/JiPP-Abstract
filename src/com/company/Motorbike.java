package com.company;

class Motorbike extends Vehicle {

    @Override
    public void speedUP() {
        setSpeed(getSpeed() + 115);
    }
}

package com.company.ui;

public class Bus extends Transport {
    private int Wheel;

    public int getWheel() {
        return Wheel;
    }

    public Bus(double volume, int wheel) {
        super(volume);
        this.Wheel = wheel;
    }

    public void print() {
        System.out.println("" + getClass().getSimpleName() +
                "\n ОБЪЕМ: " + super.getVolume()+
                "\n ЧИСЛО:" + getWheel());
        super.print();

    }
}


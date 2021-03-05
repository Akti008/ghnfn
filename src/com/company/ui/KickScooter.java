package com.company.ui;

public class KickScooter extends Transport {

    private int size;

    public int getSize() {
        return size;
    }

    public KickScooter(double volume, int size) {
        super(volume);
        this.size = size;
    }

    public void print() {

        System.out.println("" + getClass().getSimpleName() +
                "\n ОБЪЕМ: " + super.getVolume() +
                "\n РАЗМКЕР: " + getSize());
        super.print();

    }
}

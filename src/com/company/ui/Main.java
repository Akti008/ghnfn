package com.company.ui;

public class Main {

    public static void main(String[] args) {
        createObject("Car").print();
        createObject("KickScooter").print();
        createObject("Bus").print();

    }

    public static Printable createObject(String Name) {
        Printable printable = null;
        switch (Name) {
            case "Car":
                printable = new Cars(5.5, "SEDAN");
                break;
            case "KickScooter":
                printable = new KickScooter(0.0, 31);
                break;
            case "Bus":
                printable = new Bus(4.4, 6);
                break;
        }

        return printable;
    }
}


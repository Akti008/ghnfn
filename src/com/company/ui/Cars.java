package com.company.ui;

public class Cars extends Transport {

    private String model;


    public Cars(double volume, String model) {
        super(volume);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void print(){
        System.out.println("" + getClass().getSimpleName()+
                "\n ОБЪЕМ: "+ super.getVolume()+
                "\n МОДЕЛЬ: " + getModel());
        super.print();
    }
}

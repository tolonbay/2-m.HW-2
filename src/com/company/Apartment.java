package com.company;

public class Apartment extends Houses {
    private int floor;

    public Apartment(int height, int width, String name, int floor) {
        super(height, width, name);
        this.floor  = floor;
    }


    @Override
    public void print() {
        System.out.println("Название: " +getName()+
                "\nВысота: "+getHeight()+
                "\nШирина: "+getWidth()+
                "\nЭтаж: "+floor);
    }
}

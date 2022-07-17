package com.company;

public class Main {

    public static void main(String[] args) {

    createObject("Apartment").print();
        System.out.println("____________________________________");
    createObject("Barn").print();
        System.out.println("_____________________________________");
    createObject("Castle").print();



    }

    public static Houses createObject(String ClassName) {
        switch (ClassName) {
            case "Apartment":
                return new Apartment(3,3,"Квартира:",5);
            case "Barn":
                return new Barn(10,8,"Склад:",10000);
            case "Castle":
                return new Castle(20,15,"Замок","Среднее вековый");
            default:
                return null;
        }

    }
}

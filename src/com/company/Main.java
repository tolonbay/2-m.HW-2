package com.company;

public class Main {

    public static void main(String[] args) {

//        Apartment apartment = new Apartment(4,5,"Квартира",5);
//        Castle castle = new Castle(25,50,"Букенгемский","Средневековый");
//        Barn barn = new Barn(10,20,"Сарай",100000);


    }
    String ClassName = Apartment;

    public Houses createObject(String ClassName){
        switch (ClassName){
            case Apartment:
                Apartment apartment = new Apartment();

        }
        return apartment

    };
}

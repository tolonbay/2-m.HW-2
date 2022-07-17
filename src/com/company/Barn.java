package com.company;

public class Barn extends Houses {
    private int profit;

    public Barn(int height, int width, String name, int profit) {
        super(height, width, name);
        this.profit = profit;
    }

    @Override
    public void print() {
        System.out.println("Название: " +getName()+
                "\nВысота: "+getHeight()+
                "\nШирина: "+getWidth()+
                "\nЭтаж: "+profit);
    }
}

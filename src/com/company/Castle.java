package com.company;

public class Castle extends Houses{
    private String history;

    public Castle(int height, int width, String name,String history) {
        super(height, width, name);
        this.history = history;
    }

    @Override
    public void print() {
        System.out.println("Название: " +getName()+
                "\nВысота: "+getHeight()+
                "\nШирина: "+getWidth()+
                "\nЭтаж: "+history);
    }
}

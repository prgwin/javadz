package ru.petrov.task8.ActAndContract;

import java.util.Arrays;

public class Contract {
    private int number;         // Номер договра
    private String date;        // Дата договора
    private String[] goods = new String[]{"Линейка", "Ручка", "Карандаш"};  // Перечень товаров
    //private String[] goods = {"Линейка","Ручка","Карандаш"};  // Перечень товаров


    public Contract(int number, String date) {
        this.number = number;
        this.date = date;
    }

    //ТОЛЬКО геттеры
    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getGoods() {
        return goods;
    }
}

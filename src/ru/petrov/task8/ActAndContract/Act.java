package ru.petrov.task8.ActAndContract;

import java.util.Arrays;

public class Act {
    private int number;         // Номер договра
    private String date;        // Дата договора
    private String[] goods = new String[3];  // Пустой перечень товаров

    //ТОЛЬКО сеттеры
    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGoods(String[] goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Act{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }
}

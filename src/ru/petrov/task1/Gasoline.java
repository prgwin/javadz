package ru.petrov.task1;

public class Gasoline {
    public static void main(String[] args) {
        int price = 42;
        int litr = 30;
        int sum = price * litr;

        System.out.println("Цена литра бензина " + price + " руб.");
        System.out.println("Количество литров " + litr);
        System.out.println("Итоговая стоимость: " + sum);
    }
}

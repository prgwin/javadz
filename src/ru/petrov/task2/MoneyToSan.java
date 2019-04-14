package ru.petrov.task2;

import java.util.Scanner;

public class MoneyToSan {
    public static void main(String[] args) {
        System.out.println("Введите оклад");
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int ndfl = 13;
        int clearMoney = money - (money / 100) * ndfl;

        System.out.println("Ваша зарплата \"на руки\" за вычетом НДФЛ: " + clearMoney);
    }
}

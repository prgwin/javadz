package ru.petrov.task1;

public class Money {
    public static void main(String[] args) {
        int money = 60000;
        int ndfl = 13;
        int clearMoney = money - (money/100)*ndfl;

        System.out.println("Зарплата на руки "+ clearMoney);
    }
}

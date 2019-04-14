package ru.petrov.task2;

import java.util.Scanner;

public class GasolineToScan {
    public static void main(String[] args) {
        System.out.println("Введите стоимоть бензина и количество литров");
        Scanner scan = new Scanner(System.in);

        int price = scan.nextInt();
        int litr = scan.nextInt();
        int sum = price * litr;

        System.out.println("Итоговая стоимость: " + sum);
    }
}

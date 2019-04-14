package ru.petrov.task2;

import java.util.Scanner;

public class TimeToScan {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();
        double hour = (double) seconds / 3600;
        System.out.printf(seconds + " секунд это %.1f", hour);
        System.out.println(" часа");
    }
}

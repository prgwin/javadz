package ru.petrov.task3;

import java.util.Scanner;

/**
 * Написать программу, которая описывает введенное число.
 * Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
 */
public class AboutNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int mod = number % 2;

        if (number != 0) {
            if ((number > 0) && (mod == 0)) {
                System.out.println("Ваше число - положительное, четное ");
            }
            if ((number > 0) && (mod != 0)) {
                System.out.println("Ваше число - положительное, нечетное ");
            }
            if ((number < 0) && (mod == 0)) {
                System.out.println("Ваше число - отрицательное, четное ");
            }
            if ((number < 0) && (mod != 0)) {
                System.out.println("Ваше число - отрицательное, нечетное ");
            }
        } else {
            System.out.println("Вы ввели ноль!");
        }
    }
}

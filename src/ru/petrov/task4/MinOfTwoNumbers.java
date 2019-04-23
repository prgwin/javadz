package ru.petrov.task4;
import java.util.Scanner;
/*Написать программу для поиска минимального из двух чисел.
 */

public class MinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int numOne = scanner.nextInt();
        System.out.println("Введите второе число");
        int numTwo = scanner.nextInt();

        if (numOne < numTwo) {
            System.out.println("Минимальное число " + numOne);
        } else {
            System.out.println("Минимальное число " + numTwo);
        }
    }
}


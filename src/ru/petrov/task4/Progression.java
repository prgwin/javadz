package ru.petrov.task4;

import java.util.Scanner;
//Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

public class Progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый элемент арифметической/геометрической прогрессии");
        int number = scanner.nextInt();
        int numberBuffer = number;

        System.out.println("Введите коэфициент арифметической/геометрической прогрессии");
        int progression = scanner.nextInt();

        System.out.println("Введите количесвтво элементов арифметической/геометрической прогрессии, дополнительно к первому");
        int count = scanner.nextInt();

        System.out.print("Арифметическая прогрессия: " + number);

        for (int i = 0; i < count; i++) {
            number = number + progression;
            System.out.print(" " + number);
        }
        System.out.println(""); // существует ли в Java оператор переноса строки вместо пустого sout?

        number = numberBuffer;
        System.out.print("Геометрическая прогрессия: " + number);
        for (int i = 0; i < count; i++) {
            number = number * progression;
            System.out.print(" " + number);
        }
    }
}

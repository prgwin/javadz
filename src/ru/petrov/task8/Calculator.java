package ru.petrov.task8;

//Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
// сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами,
// так и с дробями.
public class Calculator {
    public static void main(String[] args) {
        subtraction(18, 9);    //Вычитание
        subtraction(19.3, 10.9);

        addition(28, 17);        // Сложение
        addition(128.3, 18.5);

        division(35, 7);         // Деление
        division(35.8, 7.3);
    }

    //Вычитание
    public static void subtraction(int a, int b) {
        System.out.println("Результат вычитания (a-b)= " + (a - b));
    }

    public static void subtraction(double a, double b) { //Перегрузка метода
        System.out.println("Результат вычитания (a-b)= " + (a - b));
    }

    // Сложение
    public static void addition(int a, int b) {
        System.out.println("Результат сложения (a+b)= " + (a + b));
    }

    public static void addition(double a, double b) { //Перегрузка метода
        System.out.println("Результат сложения (a+b)= " + (a + b));
    }

    // Деление
    public static void division(int a, int b) {
        System.out.println("Результат деления (a / b)= " + (a / b));
    }

    public static void division(double a, double b) { //Перегрузка метода
        System.out.println("Результат деления (a / b)= " + (a / b));
    }
}

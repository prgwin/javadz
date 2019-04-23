package ru.petrov.task4;
//Написать программу для вывода на экран таблицы умножения.
public class MultiplicationTable {
    public static void main(String[] args) {
        int stolb = 0;
        int stroka = 0;
        while (stolb < 10) {
            stolb++;
            while (stroka < 10) {
                stroka++;
                System.out.printf("%4d", stolb * stroka);
            }
            stroka = 0;
            System.out.println();
        }
    }
}

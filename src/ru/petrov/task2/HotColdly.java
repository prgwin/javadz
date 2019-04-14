package ru.petrov.task2;

import java.util.Scanner;

public class HotColdly {
    public static void main(String[] args) {
        System.out.println("Угадайте число");
        System.out.println("Для выхода из программы введите exit");
        int otvetBuf = 0; //буфер для хранения предыдущего ответа
        int min = 1; // Начальное значение диапазона - "от"
        int max = 100; // Конечное значение диапазона - "до"
        int randomNumber = min + (int) (Math.random() * max); // Генерация случайного числа
        /* Снять коммент для отображения загаданного числа при отладке
        System.out.println("Загаданное число "+randomNumber);
        */
        while (true) {
            Scanner scan = new Scanner(System.in);
            String exit = scan.nextLine();

            if (!(exit.equals("exit"))) { //проверяем введенную строку на exit
                int otvet = Integer.parseInt(exit);

                if (randomNumber == otvet) {
                    System.out.println("Вы угудали число " + otvet + " !!!");
                    break;
                }
                // Вычисляем разницу по модулю между randomNumber и ответом пользователя
                int otvetMod = Math.abs(randomNumber - otvet);

                if (otvetMod > otvetBuf) {
                    System.out.println("Холодно");
                } else System.out.println("Горячо!");
                otvetBuf = otvetMod;

            } else break;
        }
    }
}

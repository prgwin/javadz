package ru.petrov.task7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        vm.menuChooseDrink(); // Меню выбора напитка

        int userChoice = scanner.nextInt(); // Ответ пользователя
        vm.сhooseDrink(userChoice);         // Определяем что выбрал пользователь
        vm.cashBackMoney();   //  Операции с деньгами, сдача или добавление

    }
}

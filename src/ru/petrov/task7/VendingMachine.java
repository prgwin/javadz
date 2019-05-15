package ru.petrov.task7;

import java.util.Scanner;

public class VendingMachine {
    private int totalPrise;    // Буфферная переменная стоимости товара
    private int deposit; // Внесенные деньги пользователя
    private int moneyBuf = 0; // Буффер внесенных денег пользователя
    private int addMoney = 0; // переменная недостающих средств

    Drink[] drink = new Drink[3];
    Drink tea = new Drink(1, "Чай", 50);
    Drink coffee = new Drink(2, "Кофе", 60);
    Drink cola = new Drink(2, "Кола", 70);

//    {   drink[0] = tea;
//        drink[1] = coffee;   // ПОЧЕМУ НЕЛЬЗЯ?
//        drink[2] = cola;
//    }


    public void menuChooseDrink() {    // Меню выбора напитка
        System.out.println("Выберите напиток");
        System.out.println("№ Напиток Стоимость");
        System.out.println(tea.number + "  Чай  50");
        System.out.println("2  Кофе 60");
        System.out.println("3  Кола 70");
    }

    public void сhooseDrink(int userChoice) {    //  Определяем что выбрал пользователь
        switch (userChoice) {
            case 1:
                System.out.println("Вы выбрали " + tea.name);
                totalPrise = tea.prise;
                System.out.print("Внесите " + tea.prise + "рублей");
                break;
            case 2:
                System.out.println("Вы выбрали " + coffee.name);
                totalPrise = coffee.prise;
                System.out.print("Внесите " + coffee.prise + "рублей");
                break;
            case 3:
                System.out.print("Вы выбрали " + cola.name);
                totalPrise = cola.prise;
                System.out.println("Внесите " + cola.prise + "рублей");
                break;
        }
    }

    public void cashBackMoney() {  //  Операции с деньгами, сдача или добавление
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        deposit = scanner.nextInt();
        if (deposit == totalPrise) {
            System.out.println("Заберите свой напиток, Ваша сдача " + (deposit - totalPrise));
        } else {
            while (deposit != totalPrise) {
                if (deposit >= totalPrise) {
                    System.out.println("Заберите свой напиток, Ваша сдача " + (deposit - totalPrise));
                    break;
                } else {
                    addMoney = totalPrise - deposit;
                    System.out.println("Вы внесли недостаточную сумму, внисите еще" + addMoney);
                    moneyBuf = deposit;
                    deposit = scanner.nextInt();
                    deposit = deposit + moneyBuf;
                }
            }  // конец  while
            System.out.println("Заберите свой напиток, Ваша сдача " + (deposit - totalPrise));
        }
    }
}


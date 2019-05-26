package ru.petrov.task9.t9_2;

import java.util.Scanner;

//Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
// Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
// Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName(); // унаследованый и перегруженный  метод класса Animal;
        dog.run();  // метод интерфейса Runeble
        dog.swim(); // метод интерфейса Swimeble
        Runeble do2 = getRuneble();
        do2.run();

        Fox fox = new Fox();
        fox.getName(); // унаследованый и перегруженный  метод класса Animal;
        fox.run();  // метод интерфейса Runeble
        fox.swim(); // метод интерфейса Swimeble

        Duck duck = new Duck();
        duck.getName(); // унаследованый и перегруженный  метод класса Animal;
        duck.fly();  // метод интерфейса Flyeble
        duck.run();  // метод интерфейса Runeble
        duck.swim(); // метод интерфейса Swimeble
    }

    private static Runeble getRuneble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("кого вы хотите создать 1 - собака  2- лиса ");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                return new Dog();
            case 2:
                return new Fox();
            default:
                throw new IllegalArgumentException("такого типа не бывает");

        }
    }
}


package ru.petrov.task9.t9_2;

import ru.petrov.task9.t9_2.Animal;

public class Fox extends Animal implements Runeble, Swimeble {
    @Override
    void getName() {
        System.out.println("Я Лиса!");
    }

    @Override
    public void run() {
        System.out.println("Лиса бегает");

    }

    @Override
    public void swim() {
        System.out.println("Лиса плавает ");

    }
}

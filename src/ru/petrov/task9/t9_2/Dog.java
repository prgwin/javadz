package ru.petrov.task9.t9_2;

public class Dog extends Animal implements Runeble, Swimeble {
    @Override
    void getName() {
        System.out.println("Я Собака!");
    }

    @Override
    public void run() {
        System.out.println("Собака быстро бежит");
    }

    @Override
    public void swim() {
        System.out.println("Собака умеет плавать");
    }


}

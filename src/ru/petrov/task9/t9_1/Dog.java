package ru.petrov.task9.t9_1;

public class Dog extends Animal {
    @Override
    void getName() {
        System.out.println("Я Собака!");
    }

    void bark() {
        System.out.println("gaf");
    }
}

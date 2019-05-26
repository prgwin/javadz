package ru.petrov.task9.t9_2;

import javax.sound.midi.Soundbank;

public class Duck extends Animal implements Runnable, Swimeble, Flyeble {
    @Override
    void getName() {
        System.out.println("Я Утка!");
    }

    @Override
    public void run() {
        System.out.println("Утка медленно бегает");
    }

    @Override
    public void fly() {
        System.out.println("Утка хорошо летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка отлично плавает");
    }
}

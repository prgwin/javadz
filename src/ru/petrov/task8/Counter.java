package ru.petrov.task8;
// Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
// Написать метод для получения информации о количестве.

public class Counter {
    static int count;

    public Counter() {
        count++;
        //System.out.println("New Constryktor");
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        numberCount();
    }

    public static void numberCount() {
        System.out.println("Создано объектов " + count);
    }
}

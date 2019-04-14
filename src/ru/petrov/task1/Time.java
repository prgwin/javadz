package ru.petrov.task1;

/**
 * перевод секунд в часы
 */
public class Time {
    public static void main(String[] args) {
        int seconds = 10800;
        int hours = seconds / 3600;
        System.out.println(seconds + " секунд это " + hours  + " часа");
    }
}

package ru.petrov.task22;

import java.util.*;

//Написать класс PersonSuperComparator,
//который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
//Класс Person теперь содержит два поля int age и String name
public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", 34));
        persons.add(new Person("Сергей", 32));
        persons.add(new Person("Екатерина", 26));
        persons.add(new Person("Коля", 27));
        persons.add(new Person("Сергей", 28));

        System.out.println("Не отсортированная коллекция");
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("Отсортированная коллекция");
        Collections.sort(persons, new PersonSuperComparator());
        System.out.println(persons);
    }
}


package ru.petrov.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Написать класс PersonSuperComparator,
//который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
//Класс Person теперь содержит два поля int age и String name
public class App {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Иван", 34));
        person.add(new Person("Сергей", 32));
        person.add(new Person("Екатерина", 26));
        person.add(new Person("Коля", 27));
        person.add(new Person("Сергей", 28));

        System.out.println("Не отсортированная коллекция");
        Iterator iterator = person.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Отсортированная коллекция");
        Collections.sort(person, new PersonSuperComparator());
        System.out.println(person);
    }
}

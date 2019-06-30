package ru.petrov.task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getName().compareTo(o2.getName()); //Сравниваем по name
        if (result != 0) {    //Если name равны, сравниваем по age
            return result;
        } else {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}

package ru.petrov.task9.t9_1;

//Написать абстрактный класс Animal с абстрактным методом getName. Сделать несколько классов животных,
// наследников Animal. Метод getName должен выводит название каждого животного.
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        Animal dog = new Dog();

        Animal fox = new Fox();
        Animal duck = new Duck();
        getAnimalName(dog);
        getAnimalName(fox);
        getAnimalName(duck);

        doAnimalBark(dog);
        doAnimalBark(fox);
        doAnimalBark(duck);
    }

    private void doAnimalBark(Animal animal) {
        if (animal instanceof Dog) {
            Dog dogFake = (Dog) animal;
            dogFake.bark();
        } else {
            System.out.println("я не dog не могу bark");
        }

    }

    private void getAnimalName(Animal animal) {
        animal.getName();
    }
}

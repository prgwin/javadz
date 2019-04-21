package ru.petrov.task4;

public class Client extends Person {
    private int creditRating;   // Кридитный рейтинт от 1 до 5
    //private int innNumber;          // Номер ИНН


    public Client(String firstName, String lastName, String pasportNumber, int creditRating) {
        super(firstName, lastName, pasportNumber);
        this.creditRating = creditRating;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }
}

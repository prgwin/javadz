package ru.petrov.task4;

public class Person {
    private String firstName;
    private String lastName;
    private String pasportNumber;

    public Person(String firstName, String lastName, String pasportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pasportNumber = pasportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pasportNumber='" + pasportNumber + '\'' +
                '}';
    }
}

package ru.petrov.task6;

import java.util.Arrays;

//Кридитная карта банка
public class Cart {
    private String titleCart;  // Тип кредитной карты - "100 дней без процентов", "Аэрофлот.копи мили" и т.д.
    private Client[] clients = new Client[10];

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public String getTitleCart() {
        return titleCart;
    }

    public void setTitleCart(String titleCart) {
        this.titleCart = titleCart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "titleCart='" + titleCart + '\'' +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}


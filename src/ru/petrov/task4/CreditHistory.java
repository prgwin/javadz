package ru.petrov.task4;

import java.util.Arrays;

public class CreditHistory {
    private String titleCreditHistory;
    private Cart[] carts = new Cart[5];

    public String getTitleCreditHistory() {
        return titleCreditHistory;
    }

    public void setTitleCreditHistory(String titleCreditHistory) {
        this.titleCreditHistory = titleCreditHistory;
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "CreditHistory{" +
                "titleCreditHistory='" + titleCreditHistory + '\'' +
                ", carts=" + Arrays.toString(carts) +
                '}';
    }
}

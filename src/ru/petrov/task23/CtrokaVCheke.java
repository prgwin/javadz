package ru.petrov.task23;

public class CtrokaVCheke {
    private String nazvanieTovara;
    private int quantity;

    public CtrokaVCheke(String nazvanieTovara, int quantity) {
        this.nazvanieTovara = nazvanieTovara;
        this.quantity = quantity;
    }

    public void setNazvanieTovara(String nazvanieTovara) {
        this.nazvanieTovara = nazvanieTovara;
    }

    public String getNazvanieTovara() {
        return nazvanieTovara;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CtrokaVCheke{" +
                "nazvanieTovara='" + nazvanieTovara + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

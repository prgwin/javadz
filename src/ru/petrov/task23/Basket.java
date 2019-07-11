package ru.petrov.task23;

import java.util.List;

public interface Basket {
    void addProduct(String nazvanieTovara, int quantity);

    void removeProduct(String nazvanieTovara);

    void updateProductQuantity(String nazvanieTovara, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String nazvanieTovara);

    /////////////
    void addTovar(String nazvanieTovara, int quantity);


}

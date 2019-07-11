package ru.petrov.task23;

import java.util.ArrayList;
import java.util.List;

public class BasketListImpl implements Basket {


    private List<CtrokaVCheke> spisokPokupok = new ArrayList<>();

    @Override
    public void addProduct(String nazvanieTovara, int quantity) {
        CtrokaVCheke ctrokaVCheke = naitiStroky(nazvanieTovara);
        if (ctrokaVCheke == null) {
            ctrokaVCheke = new CtrokaVCheke(nazvanieTovara, 0);
            spisokPokupok.add(ctrokaVCheke);
        }
        ctrokaVCheke.setQuantity(ctrokaVCheke.getQuantity() + quantity);
    }

    @Override// УДАЛИТЬ
    public void addTovar(String nazvanieTovara, int quantity) {
        CtrokaVCheke ctrokaVCheke = new CtrokaVCheke(nazvanieTovara, quantity);
//        ctrokaVCheke.setNazvanieTovara("NOT pepsi");
//        spisokPokupok.add(ctrokaVCheke);
        ctrokaVCheke.setQuantity(ctrokaVCheke.getQuantity() + quantity);
        ctrokaVCheke.setNazvanieTovara("NOT pepsi");
        spisokPokupok.add(ctrokaVCheke);
    }


    private CtrokaVCheke naitiStroky(String nazvanieTovara) {
        for (CtrokaVCheke ctrokaVCheke : spisokPokupok) {
            if (ctrokaVCheke.getNazvanieTovara().equals(nazvanieTovara)) {
                return ctrokaVCheke;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(String product) {
        spisokPokupok.remove(naitiStroky(product));
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        CtrokaVCheke ctrokaVCheke = naitiStroky(product);
        if (ctrokaVCheke != null) {
            ctrokaVCheke.setQuantity(quantity);
        }
    }

    @Override
    public void clear() {
        spisokPokupok.clear();
    }


    @Override
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        for (CtrokaVCheke vCheke : spisokPokupok) {
            products.add(vCheke.getNazvanieTovara());
        }
        return products;
    }

    @Override
    public int getProductQuantity(String product) {
        CtrokaVCheke ctrokaVCheke = naitiStroky(product);
        return ctrokaVCheke != null ? ctrokaVCheke.getQuantity() : 0;
    }

    @Override
    public String toString() {
        return "BasketListImpl{" +
                "spisokPokupok=" + spisokPokupok +
                '}';
    }
}

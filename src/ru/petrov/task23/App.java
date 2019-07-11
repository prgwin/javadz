package ru.petrov.task23;

public class App {
    public static void main(String[] args) {

        App app = new App();
        app.run();


    }

    private void run() {
        Basket basket = new BasketListImpl();

        System.out.println("Добавляем товар:");
        basket.addProduct("Cola", 1);
        basket.addProduct("Pepsi", 2);
        basket.addProduct("Cola", 2);
        basket.addProduct("Tea", 1);
        basket.addProduct("Mirinda", 5);
        basket.addProduct("DrPepper", 3);
        System.out.println(basket);
        System.out.println(basket.getProducts());
        System.out.println("Количество товара " + basket.getProductQuantity("Cola"));

        System.out.println("Удаляем товар:");
        basket.removeProduct("Pepsi");
        System.out.println(basket);

        System.out.println("Увеличиваем  количество товара:");
        basket.updateProductQuantity("Tea", 5);
        System.out.println(basket);

        System.out.println("Возвращаем клоличество товара по названию:");
        basket.getProductQuantity("Mirinda");
        System.out.println(basket);


        System.out.println("Итерация:");
        basket.getProducts();

        System.out.println("Очистка корзины:");
        basket.clear();
        System.out.println(basket);


//        product.addProduct("Qwe",1);
//        product.addProduct("qwer",1);
//        System.out.println(product);

//        product.addProduct("qwert",5);
//        System.out.println(product.basketList);

    }
}

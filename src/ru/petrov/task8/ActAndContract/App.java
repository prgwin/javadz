package ru.petrov.task8.ActAndContract;

//Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк)
//Написать класс со статическим методом конвертации договора в акт (на вход передавать договор,
// на выходе получаем акт).
//
// class Contract  - договор
// class Act - акт принимает поля договора
// class Convert - конвертер из договора в акт
public class App {
    public static void main(String[] args) {
        App app = new App();

        app.contractToAct();
    }

    public void contractToAct() {
        Contract contract = new Contract(889, "01.01.2019", "Линейка", "Ручка", "Карандаш");
        Act act = new Act();

        act.setNumber(contract.getNumber());
        act.setDate(contract.getDate());
        act.setGoods(contract.getGoods());

        System.out.println("Создан акт " + act);
    }
}

package ru.petrov.task6;

public class BankApp {
    public static void main(String[] args) {
        Client ivanov = new Client("Иван", "Иванов", "12 18 16", 4);
        Client shnipperson = new Client("Иннокентий", "Шнипперсон", "20 38 78", 5);

        CreditHistory ivanovHistory = new CreditHistory();
        Cart cartIvanov = new Cart();
        cartIvanov.setTitleCart("100 дней без процентов");

        cartIvanov.setClients(new Client[]{ivanov});
        ivanovHistory.setCarts(new Cart[]{cartIvanov});


        CreditHistory shnippersonHistory = new CreditHistory();
        Cart cartShnipperson = new Cart();
        cartShnipperson.setTitleCart("Аэрофлот.копи мили");

        cartShnipperson.setClients(new Client[]{shnipperson});
        shnippersonHistory.setCarts(new Cart[]{cartShnipperson});


        System.out.println(ivanovHistory);
        System.out.println(shnippersonHistory);


    }
}

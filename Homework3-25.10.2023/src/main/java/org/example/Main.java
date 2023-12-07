package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category(1,"Elektronik");
        Product product1 = new Product("Telefon",1,58000,58,category1);
        User user1 = new User(1,"Taner","Dökmetaş","tanerdokmets@gmail.com","05555555555");
        Order order1 = new Order(1,product1,user1);
        // Taner Dökmetaş Elektronik kategorisindeki 58 stoklu telefonu tanerdokmets@gmail.com ve 05555555555 bilgileriyle satın almıştır.
        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " " + category1.getCategoryName() + " kategorisindeki " + product1.getStockAmount() + " " + "stoklu " + product1.getName() + "'u " + user1.getEmail() + " ve " + user1.getPhoneNumber() + " bilgileriyle satın almıştır.");

    }
}
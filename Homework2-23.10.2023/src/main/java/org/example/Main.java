package org.example;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Kitchen Aid Kahve Makinesi";
        product.discount = 5;
        product.imageUrl = "bilmemne.jpg";
        product.unitPrice = 6000;
        product.unitsInStock = 3;

        Product product1 = new Product();
        product1.name = "Bosch Aid Kahve Makinesi";
        product1.discount = 2;
        product1.imageUrl = "bilmemne1.jpg";
        product1.unitPrice = 7000;
        product1.unitsInStock = 4;

        Product product2 = new Product();
        product2.name = "Simenes Aid Kahve Makinesi";
        product2.discount = 3;
        product2.imageUrl = "bilmemne2.jpg";
        product2.unitPrice = 6400;
        product2.unitsInStock = 7;

        Product[] products = {product,product1,product2};

        for(Product product3:products) {
            System.out.println(product3.name);
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1234");
        individualCustomer.setCustomerPhone("055555555555");
        individualCustomer.setFirstName("Taner");
        individualCustomer.setLastName("Dökmetaş");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCompanyName("Tobeto");
        corporateCustomer.setCustomerPhone("0555555555");
        corporateCustomer.setTaxNumber("54321");
        corporateCustomer.setCustomerNumber("6789");

        Customer[] customers = {individualCustomer, corporateCustomer};

        for (Customer customer:customers){
            System.out.println(customer.getCustomerNumber());
        }


    }
}
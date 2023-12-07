package org.example.business;

import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

public class ProductManager {
    public void add(Product product) throws Exception {
        //İş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }
        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
    }
}

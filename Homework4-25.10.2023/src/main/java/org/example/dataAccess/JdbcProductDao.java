package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao {
    public  void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır./SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}

package oopWithAndLayerApp.DataAccsess;

import oopWithAndLayerApp.Entities.Product;

public class JDBCProductDao implements ProductDao{
    public void add(Product product){
        System.out.println("JDBC ile veritabinina eklendi");
    }
}

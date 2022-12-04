package oopWithAndLayerApp.DataAccsess;

import oopWithAndLayerApp.Entities.Product;

public class HibernateDao implements ProductDao{
    public void add(Product product){
        System.out.println("HiberNate ile veritabinina eklendi");
    }
}

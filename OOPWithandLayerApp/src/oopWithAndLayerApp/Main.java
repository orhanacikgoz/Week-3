package oopWithAndLayerApp;

import oopWithAndLayerApp.BusinessAccess.ProductManager;
import oopWithAndLayerApp.DataAccsess.HibernateDao;
import oopWithAndLayerApp.DataAccsess.JDBCProductDao;
import oopWithAndLayerApp.Entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1456, "Iphone 14 Pro", 23.89);
        ProductManager productManager=new ProductManager(new HibernateDao());
        productManager.add(product1);


    }



    }


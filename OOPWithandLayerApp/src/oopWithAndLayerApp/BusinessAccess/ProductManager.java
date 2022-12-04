package oopWithAndLayerApp.BusinessAccess;

import oopWithAndLayerApp.DataAccsess.HibernateDao;
import oopWithAndLayerApp.DataAccsess.JDBCProductDao;
import oopWithAndLayerApp.DataAccsess.ProductDao;
import oopWithAndLayerApp.Entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao){
        this.productDao=productDao;
    }


    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<10){
            throw new Exception("URUN FIYATI 10 DAN KUCUK OLAMAZ");
        }
        productDao.add(product);




    }
}

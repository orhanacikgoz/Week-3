import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CustoomerManager custoomerManager=new CustoomerManager(new OracleCustomerDal());
       //  custoomerManager.customerDao=new OracleCustomerDal();
        custoomerManager.add();







}




//  GameCalculator[] gameCalculators=new GameCalculator[]{new KidsGamer(),new ManGamer(),new WomanGamer()} ;
//        for (GameCalculator gameCalculator:gameCalculators){
//            System.out.println(gameCalculator.puan());
//        }




// BaseCrediManager2[] baseCrediManager2s=new BaseCrediManager2[]{new TarimKrediManager2(),new OgretmenKrediManager2(),new Ogrenci()};
//
//        for (BaseCrediManager2 baseCrediManager2:baseCrediManager2s){
//            System.out.println(baseCrediManager2.hesapla(1000));
//        }










//  BaseLogger[] loggers=new BaseLogger[]{new BaseLogger(),new DataBaseLogger(), new FileLogger(),new DataBaseLogger()};
//        for (BaseLogger logger:loggers){
//            System.out.println(logger);
//        }
//
//        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
//        customerManager.add();





//-------------------------------------------------------------------------------------
//      KrediUI krediUI=new KrediUI();
//      krediUI.KrediHesapla(new TarimKrediManager());

}

//-------------------------------------------------------------------------------------
//      Customer customer=new Customer();
//        Employee employee=new Employee();
//        CustomerManager customerManager=new CustomerManager();
//        EmployeeManager employeeManager=new EmployeeManager();
//
//        employeeManager.ayinElamani();
//        customerManager.list();

//-------------------------------------------------------------------------------------

//      Product product=new Product(1,"Laptop", "Asus Laptop",12.8,8,"Mavi");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(500);
//        product.setStockAmount(3);
//
//        ProductManager productManager=new ProductManager();
//        productManager.add(product);
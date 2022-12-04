public class CustoomerManager {
    private ICustomerDao customerDao;
    public CustoomerManager(ICustomerDao iCustomerDao){
        this.customerDao=iCustomerDao;
    }
    public void add(){
        customerDao.add();

    };
}

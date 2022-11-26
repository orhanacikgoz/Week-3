class credit{
    public void CalculateCredit(ICreditManager iCreditManager){
        iCreditManager.hesapla();
    }
    public void SaveCredit(ICreditManager iCreditManager){
        iCreditManager.save();
    }}
public class Main {
    public static void main(String[] args) {
        credit credit=new credit();
        credit.CalculateCredit(new TeacherCreditManager());

        CreditManager creditManager=new CreditManager();
        CustomerManager customerManager=new CustomerManager();
        Customer customer=new Customer();
        Company company=new Company();


        customer.setAge(23);
        customer.setId(3598745);
        customer.setLastName("Acikgoz");
        customer.setFirtName("Orhan");
        company.setTaxNumber(123598946);
        customerManager.Save();
        System.out.println(customer.getId());
        System.out.println(customer.getAge());
        System.out.println(customer.getFirtName() + customer.getLastName());
        System.out.println(company.getTaxNumber());












    }
}
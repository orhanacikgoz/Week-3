public class TeacherCreditManager implements ICreditManager{

    @Override
    public void hesapla() {
        System.out.println("Ogretmen Kredisi Hesaplandi");
    }

    @Override
    public void save() {
        System.out.println("Ogretmen Kredisi Kaydedildi");

    }
}

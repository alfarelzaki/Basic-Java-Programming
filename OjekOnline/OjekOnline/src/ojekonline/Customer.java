package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class Customer extends User{
    public Customer(String username, String password, int saldo){
        super(username, password, saldo);
    }
    
    void tambahSaldo(int tambah){
        saldo += tambah;
    }
    
    void pesanGoFood(Motor motor, int jarak, Makanan makanan, int banyak){
        saldo -= motor.tarif*jarak;
        saldo -= makanan.harga*banyak;
        motor.driverDapetDuit(jarak);
    }
    
    void pesanGoJek(Motor motor, int jarak){
        saldo -= motor.tarif*jarak;
        motor.driverDapetDuit(jarak);
    }
    
    void pesanGoCar(Mobil mobil, int jarak){
        saldo-= mobil.tarif*jarak;
        mobil.driverDapetDuit(jarak);
    }
    
    public String toString(){
        return "Customer" + "\n" +
               "--------------------" + "\n" + super.toString();
    }
}

package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class Motor extends Kendaraan{
    int tarif=4000;
    public Motor (String merk, String warna, String plat, Driver driver){
        super(merk, warna, plat, driver);
    }
    
    public void driverDapetDuit(int jarak){
        driver.saldo += jarak*tarif*0.8;
    } 
    
    public String toString(){
        return "Motor" + "\n" + super.toString();
    }
}

package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class Kendaraan {
    String merk, warna, plat;
    int tarif;
    Driver driver;
    
    public Kendaraan(String merk, String warna, String plat, Driver driver){
        this.merk = merk;
        this.warna = warna;
        this.plat = plat;
        this.driver = driver;
    }
    
    public String toString(){
        return "------------------" + "\n" +
        "Merk      : " + merk + "\n" +
        "Warna     : " + warna + "\n" +
        "Plat      : " + plat + "\n" +
        "Driver    : " + driver.username + "\n";
    }
}

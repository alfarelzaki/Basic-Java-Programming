package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class Mobil extends Kendaraan{
    int tarif=7000;
    int jumlahPenumpang;
    
    public Mobil(String merk, String warna, String plat, Driver driver, int jumlahPenumpang){
        super(merk, warna, plat, driver);
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    public void driverDapetDuit(int jarak){
        driver.saldo += jarak*tarif*0.8;
        System.out.println(jarak);
    } 
    
    public String toString(){
        return "Mobil" + "\n" + super.toString() + "Jumlah penumpang : " + jumlahPenumpang + "\n";
    }
}

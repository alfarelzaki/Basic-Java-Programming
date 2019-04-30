package tugasoop1;

public class Mobil {
    String merk, warna, plat, transmisi, gigi, seri;
    int tahun, jumlahPenumpang;
    
    public Mobil(String merk, int tahun, String warna, String plat, int jumlahPenumpang, String transmisi, String gigi){
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        this.plat = plat;
        this.jumlahPenumpang = jumlahPenumpang;
        this.transmisi = transmisi;
        this.gigi = gigi;
    }
    
    public String toString(){
        return "Mobil\n" +
        "------------\n" +
        "merk : " + this.merk + "\n" +
        "tahun : " + this.tahun + "\n" +
        "warna : " + this.warna + "\n" +
        "plat : " + this.plat + "\n" +
        "jumlah penumpang : " + this.jumlahPenumpang + "\n" +
        "transmisi : " + this.transmisi + "\n" +
        "gigi : " + this.gigi + "\n";
    }
}

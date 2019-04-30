//deklarasi class
public class Mahasiswa{
	//deklarasi variabel
	String nama;
	String alamat;
	String jenisKelamin;

	//main method
	public static void main (String[]a){
		//buat instance
		Mahasiswa m1 = new Mahasiswa();
		m1.nama = "Dian";
		m1.alamat = "Sleman";
		m1.jenisKelamin = "Perempuan";
		
		System.out.println("Halo, nama saya "+m1.nama+" saya tinggal di "+m1.alamat+" saya anak "+m1.jenisKelamin);
	} 
}
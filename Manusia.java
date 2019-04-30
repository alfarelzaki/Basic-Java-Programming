public class Manusia{
	String nama;
	int umur;
	String alamat;
	
	public static void main(String[] args){
		Manusia farel = new Manusia();
		
		farel.nama = "Alfarel Zaki";
		farel.umur = 18;
		farel.alamat = "Sendowo";
		
		System.out.println("Nama saya " + farel.nama + " Saya berumur " + farel.umur + " tahun, saya dari " + farel.alamat);
	}
}
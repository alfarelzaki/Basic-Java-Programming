import java.util.Scanner;

public class AyoDaftarPNS{
	public static void main(String[] args){
		Scanner ininamascanner = new Scanner(System.in);
		
		String nama, alamat;
		int umur;
		
		System.out.print("Siapa nama anda? ");
		nama = ininamascanner.next();
		System.out.print("Dimana anda tinggal? ");
		alamat = ininamascanner.next();
		System.out.print("Berapa umur anda? ");
		umur = ininamascanner.nextInt();
		
		System.out.println("Selamat anda telah menjadi PNS!");
		System.out.println("Nama anda : " + nama);
		System.out.println("Alamat anda : " + alamat);
		System.out.println("Umur anda : " + umur);
	}
}
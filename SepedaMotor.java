public class SepedaMotor {
	//ini class atau objek
	
	//mendeklarasikan attribut atau variabel
	String merk;
	int tahun;
	String warna;
	String plat;
	
	/*
	public SepedaMotor(){
		
	}
	
	ini adalah konstruktor kosong
	*/
	

	public SepedaMotor(String m, int t, String w, String p){
		merk = m;
		tahun = t;
		warna = w;
		plat = p;
	}
	
	public SepedaMotor(String m, String w){
		merk = m;
		warna = w;
	}
	
	public static void main (String[] args){
		//manual
		SepedaMotor sm2 = new SepedaMotor("Yamaha", 2019, "Biru", "AB 1 TT");
		SepedaMotor sm3 = new SepedaMotor("Suzuki", "Kuning");
		
		//membuat instance
		//SepedaMotor sm1 = new SepedaMotor(); //"new SepedaMotor adalah konstruktor"
		
		/*
		sm1.merk = "Honda";
		sm1.tahun = 2015;
		sm1.warna = "hitam";
		sm1.plat = "AB 1111 SS";
	
		System.out.println("Sepeda motor");
		System.out.println("------------");
		System.out.println("merk : " + sm1.merk);
		System.out.println("tahun: " + sm1.tahun);
		System.out.println("warna: " + sm1.warna);
		System.out.println("plat : " + sm1.plat);
		*/
		
		/*
		System.out.println("Sepeda motor");
		System.out.println("------------");
		System.out.println("merk : " + sm2.merk);
		System.out.println("tahun: " + sm2.tahun);
		System.out.println("warna: " + sm2.warna);
		System.out.println("plat : " + sm2.plat);
		*/
		
		System.out.println("Sepeda motor");
		System.out.println("------------");
		System.out.println("merk : " + sm3.merk);
		System.out.println("warna: " + sm3.warna);
	}
}
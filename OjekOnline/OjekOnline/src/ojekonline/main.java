package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class main {
    public static void main(String[] args) {
        int GSP = 2;
        int McD = 3;
        Makanan ayam1 = new Makanan("ayam krispi", 20000);
        Customer albab = new Customer("albab","albabganteng",20000);
        Customer siti = new Customer("siti", "apayo", 100000);
        Driver rohman = new Driver("rohman", "rohmanlemes", 50000);
        Driver febri = new Driver("febri", "febrikampret", 100000);
        Mobil avanza1 = new Mobil("Avanza", "Pink", "A 1 A", febri, 4);
        Motor yamaha1 = new Motor("Yamaha", "Hitam", "AB 3 C", rohman);
        
        albab.tambahSaldo(100000);
        febri.tambahSaldo(1);
        albab.pesanGoJek(yamaha1, GSP);
        siti.pesanGoCar(avanza1, GSP);
        siti.pesanGoFood(yamaha1, McD, ayam1, 2);
        System.out.println(albab);
        System.out.println(rohman);
        System.out.println(avanza1);
        System.out.println(yamaha1);
        System.out.println(siti);
        System.out.println(febri);
    }
}

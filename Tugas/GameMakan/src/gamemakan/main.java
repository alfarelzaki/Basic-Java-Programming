/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemakan;

/**
 *
 * @author Alfarel Zaki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HewanHerbifora ayam = new HewanHerbifora("Koko", "unggas", "hitam");
        System.out.println(ayam); //output1
        
        HewanKarnifora elang = new HewanKarnifora ("Lalang", "unggas", "hitam" ,"Cakar");
        System.out.println(elang); //output 2

        Tumbuhan rumput = new Tumbuhan ("riri","rerumputan");
        System.out.println(rumput); //output 3
        
        ayam.makan(rumput);
        System.out.println(ayam); //output 4

        ayam.makan(rumput);
        System.out.println(ayam); //output 5

        elang.makan(ayam);
        System.out.println(ayam); //output 6
        
        Kucing kiki = new Kucing("kiki", "persia", "abu-abu", "taring", "bulu halus");
        
        System.out.println(kiki);
        System.out.println(kiki.bersuara());
    }
}

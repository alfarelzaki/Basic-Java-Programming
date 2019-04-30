/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemakan;

/**
 *
 * @author praktikan
 */
public class HewanHerbifora extends Hewan{
    int poin=0;
    
    public HewanHerbifora(String nama, String spesies, String warna){
        this.nama = nama;
        this.spesies = spesies;
        this.warna = warna;
    }
    
    public String toString(){
        return "Hewan herbifora\n" + "---------------\n" +
               "Nama		: " + nama + "\n" +
               "Spesies	        : " + spesies + "\n" +
               "Warna		: " + warna + "\n" +
               "Poin 		: " + poin + "\n";
    }
    
    public void makan(Tumbuhan tumbuhan){
        poin = poin+3;
    }
}

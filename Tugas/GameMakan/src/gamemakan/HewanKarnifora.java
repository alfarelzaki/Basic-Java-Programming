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
public class HewanKarnifora extends Hewan{
    String alatPembunuh;
    
    public HewanKarnifora(String nama, String spesies, String warna, String alatPembunuh){
        this.nama = nama;
        this.spesies = spesies;
        this.warna = warna;
        this.alatPembunuh = alatPembunuh;
    }
    
    public String toString(){
        return "Hewan karnivora" + "\n" +
               "---------------" + "\n" +
               "Nama            : " + nama + "\n" +
               "Spesies		: " + spesies + "\n" +
               "Warna		: " + warna + "\n" +
               "Alat Pembunuh	: " + alatPembunuh + "\n";
    }
    
    public void makan(HewanHerbifora herbifora){
        herbifora.poin = herbifora.poin-5;
    }
}

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
public class Tumbuhan extends MakhlukHidup{
    
    public Tumbuhan(String nama, String spesies){
        this.nama = nama;
        this.spesies = spesies;
    }

    public String toString(){
        return "Tumbuhan\n" + "---------------\n" +
               "Nama		: " + nama + "\n" +
               "Spesies		: " + spesies + "\n";
    }
}

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
public class Kucing extends HewanKarnifora{
    String bulu;
    
    public Kucing(String nama, String spesies, String warna, String alatPembunuh, String bulu){
        super (nama, spesies, warna, alatPembunuh);
        this.bulu = bulu;
    }
    
    public String bersuara(){
        return "mbeeeek";
    }
}

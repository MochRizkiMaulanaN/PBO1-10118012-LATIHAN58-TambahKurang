/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main58;

/**
 *
 * @author LENOVO
 */
public class SelisihBilangan extends Bilangan {
     public void tampilHasilSelisih(){
        int hasil=getX() - getY();
        System.out.println("Hasil Selisih "+getX()+ " - "+getY()+" : "+hasil);
    }
}

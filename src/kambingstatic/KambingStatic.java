/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;


/**
 *
 * @author 
 * Nama : Permai Ramadhan
 * Kelas : IF 2
 * NIM : 10118060
 * Deskripsi Program : Kambing Statik
 */
public class KambingStatic {
  //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
      Mamalia.jumlahKambing = 485000;
      System.out.println(NAMA_KAMBING + " Memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}

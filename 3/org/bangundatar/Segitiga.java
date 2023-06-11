/**
   FIle : Segitiga.java
   Penulis : Labib Habibie Sanjaya 
   Deskripsi : Representasi objek segitiga
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
   private double alas,tinggi;

   public Segitiga(double alas, double tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
      this.jumlahSisi = 3;
   }

   public double hitungLuas(){
      return alas * tinggi * 0.5;
   }

   public void printInfo(){
      System.out.println("Bangun Segitiga berisi "+this.getJumlahSisi());
   }
}

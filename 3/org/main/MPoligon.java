/*
	File : MPoligon.java
	Penulis : Labib Habibie Snjaya
	Deskripsi : Representasi objek poligon
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] arggs){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas()+"\n");

		Segitiga segitiga = new Segitiga(5,4);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());

	}
}
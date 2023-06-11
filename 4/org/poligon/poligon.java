/**
 * File: Poligon.java
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Representasi objek poligon
 */

package org.poligon;

public class poligon {
    protected int jumlahSisi;
	
	public poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }
	
    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}
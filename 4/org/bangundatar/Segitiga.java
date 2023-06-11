/**
 * File: Segitiga.java
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Representasi objek segitiga
 */

package org.bangundatar;

import org.poligon.poligon;

public class Segitiga extends poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
		int jumlahSisi = 3;
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}

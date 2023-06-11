/**
 * File : BangunDatar.java 27/05/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */
public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * 3.14 * jejari;
    }
}
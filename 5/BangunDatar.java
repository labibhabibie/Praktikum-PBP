/**
 * BangunDatar.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getLuas() {
        return this.luas;
    }
}
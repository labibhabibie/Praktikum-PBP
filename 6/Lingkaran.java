/**
 * Lingkaran.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Kelas yang membuat implementasikan
*             cara menghitung luas lingkaran
 */
 
 import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        this.jejari = r;
    }

    public double hitungLuas() {
        return PI * this.jejari * this.jejari;
    }

    public double getJejari() {
        return this.jejari;
    }
}
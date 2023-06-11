/**
 * MLingkaran.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: implementasi cara menghitung luas lingkaran
 */
 
 import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai jejari: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + l.getJejari() + " satuan adalah " + l.hitungLuas() );
    }
}
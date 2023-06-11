/**
 * MBujurSangkar.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Kelas yang membuat implementasikan
*             cara menghitung luas bujur sangkar
 */
 
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan nilai sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
/**
 * File : BangunDatarGenericTest.java 27/05/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : main class untuk generic BangunDatar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7.0);
		
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
		bdg.set(l);
		
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Tipe Generic: " + bdg.get().getClass().getName());

    }
}
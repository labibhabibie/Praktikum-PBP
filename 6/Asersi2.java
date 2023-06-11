/**
 * Asersi2.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Program untuk demo asersi, yang akan menolak input
 *            jari-jari lingkaran yang bernilai nol
 */
 
 //class Lingkaran
 class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
		assert(jariJari > 0): "Jari-jari tidak boleh nol";
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
 public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

 
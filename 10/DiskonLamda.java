/**
 * File : DiskonLamda.java 3/06/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */
 
interface IDiskon{
	public double hitungDiskon(int harga);
}
public class DiskonLamda{
	public static void main(String[] args){
		IDiskon diskonMerdeka = new IDiskon(){
			public double hitungDiskon(int harga){
				return harga - (harga * 0.3);
				
			}
		};
		IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
		IDiskon diskonBiasa = (harga) -> {
			return harga - (harga * 0.1);
		};
		System.out.println("Diskon Merdeka : "+ diskonMerdeka.hitungDiskon(45000));
		System.out.println("Diskon Lebaran : "+ diskonLebaran.hitungDiskon(45000));
		System.out.println("Diskon Biasa : "+ diskonBiasa.hitungDiskon(45000));
	}
	
}
/**
 * File : ArrayListTest.java 27/05/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : program penggunaan objek ArrayList sebagai Collection class
 */
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang hanya dapat berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		System.out.println("Menambah Elemen");
		strings.add("Tugas");
		strings.add("Praktikum PBO");
		strings.add("Pertemuan 9");
		for(String s : strings){
			System.out.print(s+" \n");
		}
		//menghapus elemen
		System.out.println("Menghapus Elemen");
		strings.remove("Tugas");
		System.out.println();
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" \n");
		}
	}
}
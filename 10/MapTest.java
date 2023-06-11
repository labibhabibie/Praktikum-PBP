/**
 * File : MapTest.java 24/05/2023
 * Nama : Abigail Metanoia Melody
 * NIM  : 24060121120038
 * Deskripsi : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> mahasiswa = new HashMap<>();
		mahasiswa.put("24060121120038", "Abigail Metanoia Melody");
		mahasiswa.forEach((nim, nama)->System.out.println("NIM: " + nim + ", Nama Mahasiswa: " + nama));
	}
}
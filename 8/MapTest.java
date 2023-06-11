/**
 * File : MapTest.java 27/05/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//kunci-> integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "Satu");
		map.put(2, "Dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection Set

		Set<Integer> keys = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci ? tulis pada laporan anda!
		//petunjuk : gunakan iterasi seperti program ArrayListTest
		for (Integer key : keys){
			System.out.println("Kunci : " + key + ", Nilai : "+map.get(key));
		}
	}
}
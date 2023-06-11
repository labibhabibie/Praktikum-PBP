/**
 * Vehicle.java 13/05/2023
 * Penulis: Labib Habibie Sanjaya
 * NIM : 24060120120003
 * Deskripsi : Penerapan Polimorfisme Inclusion 1
 */
 
class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("Vehicle Price = "+fare);
	}
}

class Bus extends Vehicle {

}

class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("Harga Sewa Mobil = "+fare);
	}
}

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}

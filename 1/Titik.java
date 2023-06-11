/**
*Titik.java 22/2/2022
*Penulis : Labib Habibie S
*Deskripsi : Kelas Titik
*/

class Titik{
	private double absis;
	private double ordinat;
	static int counterTitik;
	
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double x, double y){
		this.absis = x;
		this.ordinat = y;
		counterTitik++;
	}
	
	void setAbsis(double x){
		this.absis = x;
	}
	
	void setOrdinat(double y){
		this.ordinat = y;
	}
	
	double getAbsis(){
		return this.absis;
	}
	
	double getOrdinat(){
		return this.ordinat;
	}
	
	static double getCounterTitik(){
		return counterTitik;
	}
	
	
}

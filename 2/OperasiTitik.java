/**
*OperasiTitik.java 04/3/2022
*Penulis : Labib Habibie Sanjaya
*Deskripsi : Kelas OperasiTitik
*/

public class OperasiTitik{
	
	private void refleksiSumbuX(Titik titik){
		double y = titik.getOrdinat();
		
		y *= -1;
		titik.setOrdinat(y);
	}
	private void refleksiSumbuY(Titik titik){
		double x = titik.getAbsis();
		
		x *= -1;
		titik.setAbsis(x);
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
	
}
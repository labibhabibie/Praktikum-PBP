/**
 * ExceptionOnArray.java 13/04/2023
 * Penulis: Labib Habibie Sanjaya
 * Deskripsi: Program penggunaan eksepsi menggunakan class libary java
 */
 
public class ExceptionOnArray {
    public static void main(String[] args) {
		//instance object array integer
        Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
        }finally{
			System.out.println("clean up code...");
		}
    }
}

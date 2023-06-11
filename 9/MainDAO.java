/**
 * File : MainDAO.java 3/06/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : Main program untuk akses DAO
 */
 public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	
	
	}
 
 
 }
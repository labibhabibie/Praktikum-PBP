/**
 * File : DAOManager.java 3/06/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : pengelola DAO dalam program
 */
 public class DAOManager{
		private PersonDAO personDAO;
		
		public void setPersonDAO(PersonDAO person){
			personDAO = person;
		}
		public PersonDAO getPersonDAO(){
			return personDAO;
		}
 
 
 }
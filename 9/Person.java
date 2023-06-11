/**
 * File : Person.java 3/06/2023
 * Nama : Labib Habibie Sanjaya
 * NIM  : 24060120120003
 * Deskripsi : Person database model
 */
 public class Person{
	private int id;
	private String name;
	
	public Person(String n){
		name=n;
	}
	public Person(int i, String n){
		id = i;
		name = n;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
 }
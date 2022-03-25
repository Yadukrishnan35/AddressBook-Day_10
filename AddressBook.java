package com.blz.addressbook;

public class AddressBook {

	String firstName,lastName,address,city,state,email;
	long phoneNo;
	int zip;
	
	public void setDetails() {
		
		firstName = "Yadu";
		lastName = "krishnan";
		address = "Nirmalyam";
		city = "Calicut";
		state = "Kerala";
		email = "xyz@gmail.com";
		phoneNo = 98765443;
		zip = 1234;
	}
	
	public void printDetails() {
		System.out.println("First Name: "+firstName + "\n Last Name: "+lastName+ "\n Address: "+address+ "\n City:"+city+ "\n Email: "+email +"\nPhoneNo :"+phoneNo+"\n Zip:"+zip );
	}
}
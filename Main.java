package com.blz.addressbook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address book System");
		String firstName,lastName,address,city,state,email;
		long phoneNo;
		int zip;
		
		Scanner sc = new Scanner(System.in);
		AddressBook contact = new AddressBook();
		System.out.println("Enter the First Name:");
		firstName = sc.nextLine();
		contact.setFirstName(firstName);
		
		System.out.println("Enter the Last Name:");
		lastName = sc.nextLine();
		contact.setLastName(lastName);
		
		System.out.println("Enter the Address:");
		address = sc.nextLine();
		contact.setAddress(address);
		
		System.out.println("Enter the city:");
		city = sc.nextLine();
		contact.setCity(city);
	
		System.out.println("Enter the state:");
		state = sc.nextLine();
		contact.setState(state);
		
		System.out.println("Enter the Email:");
		email = sc.nextLine();
		contact.setEmail(email);
		
		System.out.println("Enter the Phone Number:");
		phoneNo = sc.nextLong();
		contact.setPhoneNo(phoneNo);
	
		System.out.println("Enter the Zip:");
		zip = sc.nextInt();
		contact.setZip(zip);
		
		ContactOperation contactOperate = new ContactOperation();
		contactOperate.showcontact(contact);
		
		System.out.println("Do you want to Edit: Press Y/N");
		char editOption = sc.next().charAt(0);
		if(editOption == 'Y') {
			contactOperate.editContact(contact);
			
		}
		contactOperate.showcontact(contact);
	}


}
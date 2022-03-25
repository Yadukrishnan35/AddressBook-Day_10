package com.blz.addressbook;

import java.util.Scanner;

public class ContactOperation {

	public void editContact(AddressBook contactDetails) {
		
		String address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name for Edit:");
		String editName = sc.nextLine();
		if(editName.equals(contactDetails.getFirstName()))
		{
			System.out.println("Enter new Address");
			address = sc.nextLine();
			contactDetails.setAddress(address);
		}
		else {
			System.out.println("Contact not existing");
		}
		
	}

	public void showcontact(AddressBook contactDetails) {
		
		System.out.println("First name:"+contactDetails.getFirstName());
		System.out.println("Last name:"+contactDetails.getFirstName());
		System.out.println("Address:"+contactDetails.getAddress());
		System.out.println("City:"+contactDetails.getCity());
		System.out.println("State:"+contactDetails.getState());
		System.out.println("Email:"+contactDetails.getEmail());
		System.out.println("Phone No:"+contactDetails.getPhoneNo());
		System.out.println("Zip:"+contactDetails.getZip());
	
	
	}
	
}

package com.blz.addressbook;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Address book System");
		AddressBook addressBook = new AddressBook();
		addressBook.setDetails();
		addressBook.printDetails();
	}

}

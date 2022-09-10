package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
	public static void main(String[] args) {

		List<AddressBook> person = new ArrayList<AddressBook>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome To Address Book System\n\n" + "Choose your option:\n"
					+ "1. Create new contact\n" + "2. View all the existing contacts\n");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			// Add New Contact
			case 1:
				AddressBook address = new AddressBook();

				System.out.print("Enter Your First Name: ");
				address.setFirstName(sc.nextLine());

				System.out.print("Enter Your Last Name: ");
				address.setLastName(sc.nextLine());

				System.out.print("Enter Your address: ");
				address.setCity(sc.nextLine());

				System.out.print("Enter Your City: ");
				address.setCity(sc.nextLine());

				System.out.print("Enter Your State Name: ");
				address.setState(sc.nextLine());

				System.out.print("Enter Your Zip Code: ");
				address.setZip(sc.nextInt());

				System.out.print("Enter Your Phone Number: ");
				address.setPhoneNumber(sc.nextLong());

				System.out.print("Enter Your Email Id: ");
				address.setEmail(sc.next());

				person.add(address);
				break;
			// View all existing contact
			case 2:

				for (AddressBook addPerson : person) {
					System.out.println(addPerson);
				}
				System.out.println("\n\n");
				break;
			// edit existing contact
			
			case 5:
				return;
			}
		}
	}
}

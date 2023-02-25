package addressbook.controller;

import java.util.ArrayList;
import java.util.Scanner;
import addressbook.interfaces.IMultipleAddressBook;
import addressbook.services.MUltimpleAddressBookImplementations;



public class MultipleAddressBook {

	static AddressBookMain getNewAddressBook() {
		AddressBookMain newBook = new AddressBookMain();
		return newBook;		
	}
	
	
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		
		ArrayList AddressBookList = new ArrayList();
		IMultipleAddressBook iBook = new MUltimpleAddressBookImplementations();
		int i = 0;
		System.out.println(" :: Address Book :: "+'\n'+" 1.Add Input "+'\n'+" 2.Acsess AddressBook "+'\n'+" Enter option :: ");
		switch(getInput.nextByte()) {
		case 1:	
			
			AddressBookList.add(i, iBook);
			i++;
			break;
		case 2:
			System.out.println(" Enter AddressBook ID 1:: ");
			AddressBookList.get(getInput.nextInt());
			break;			
		}
		System.out.println(iBook.addNewBook(getNewAddressBook()));
	}

}

package addressbook.controller;

import java.util.ArrayList;
import java.util.Scanner;
import addressbook.interfaces.IMultipleAddressBook;
import addressbook.services.MUltimpleAddressBookImplementations;

public class MultipleAddressBook {

	private static AddressBookMain getNewAddressBook(String[] args) {
		AddressBookMain newBook = new AddressBookMain();
		newBook.main(args);
		return newBook;
	}

	public static void main(String[] args) {

		Scanner getInput = new Scanner(System.in);

		//ArrayList AddressBookList = new ArrayList();
		IMultipleAddressBook iBook = new MUltimpleAddressBookImplementations();
		int i = 0;
		do {
		System.out.println(" :: Address Book :: " + '\n' + " 1.Add Input " + '\n' + " 2.Acsess AddressBook " + '\n'
				+ " Enter option :: ");
		switch (getInput.nextByte()) {
		case 1:
			iBook.addNewBook(i, getNewAddressBook(args));
			i++;
			break;
		case 2:
			System.out.println(" Enter AddressBook ID 1:: ");
			iBook.accessAddressBook(getInput.nextInt());
			break;
		case 3:
			System.out.println(" Enter City:: ");
			iBook.viewCityOrState(getInput.next());
			break;
		}
		System.out.println(" Press 1:: Re-Visit Menu");
		}while(getInput.nextInt() == 1);
		
	//	System.out.println(iBook.addNewBook(getNewAddressBook()));
	}

}

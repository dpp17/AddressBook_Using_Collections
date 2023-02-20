package addressbook.services;

import java.util.ArrayList;

import addressbook.controller.AddressBookMain;
import addressbook.interfaces.IMultipleAddressBook;

public class MUltimpleAddressBookImplementations implements IMultipleAddressBook{

	ArrayList<AddressBookMain> arList = new ArrayList<AddressBookMain>();
	public int addNewBook(AddressBookMain book) {
		arList.add(book);
		return arList.indexOf(book);
	}

}

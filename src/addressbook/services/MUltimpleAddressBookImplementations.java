package addressbook.services;

import java.util.ArrayList;

import addressbook.controller.AddressBookMain;
import addressbook.interfaces.IMultipleAddressBook;

public class MUltimpleAddressBookImplementations implements IMultipleAddressBook{

	ArrayList< ArrayList<AddressBookMain>> arList = new ArrayList<ArrayList<AddressBookMain>>();
	public int addNewBook(AddressBookMain book) {
		//arList.add(book.main(null));
		return arList.indexOf(book);
	}

}

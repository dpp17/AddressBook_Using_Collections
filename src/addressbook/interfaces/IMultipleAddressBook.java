package addressbook.interfaces;

import addressbook.controller.AddressBookMain;

public interface IMultipleAddressBook {

	int addNewBook(int index, AddressBookMain book);
	void accessAddressBook(int index);
}

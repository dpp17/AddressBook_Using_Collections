package addressbook.interfaces;

import addressbook.controller.AddressBookMain;

public interface IMultipleAddressBook {

	int addNewBook(int index, AddressBookMain book);
	void accessAddressBook(int index);
	void searchByCityOrState(String string);
	void viewCityOrState(String string);
	void sortAlphabeticallyByFirstName();
	void countBycityAndState(String string);
	void sortEntriesByCityStateOrZip(String string);
}

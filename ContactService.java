//Author Name: Mihir Patel

//Date: 1/24/2022

//Course ID: CS-320-T3692

//Description: This is the contact service. It maintains a list of contacts and has capabilities
//for adding and deleting contacts, as well as updating firstName, lastName, phoneNumber, address.

package contact;
import java.util.ArrayList;

public class ContactService {
	//Start with an ArrayList of contacts to hold the list of contacts
	ArrayList<Contact>contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Adds a new contact using the Contact constructor, then assign the new contact to the list.
	public boolean addContact(Contact newContact) {
		boolean filled = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				filled = true;
				break;
			}
		}
		
		if(!filled) {
			contacts.add(newContact);
			return true;
		} else {
			return false;
		}
	}
	
	//Delete contact.
	public boolean deleteContact(String contactID) {
		boolean erase = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(contactID)) {
				contacts.remove(person);
				
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	//Update the firstName.
	public boolean updateFirstName(String contactID, String newFirstName) {
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(contactID)) {
				person.setFirstName(newFirstName);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//Update the lastName.
	public boolean updateLastName(String contactID, String newLastName) {
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(contactID)) {
				person.setLastName(newLastName);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//Update the phoneNumber.
	public boolean updatePhoneNumber(String contactID, String newPhoneNumber) {
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(contactID)) {
				person.setPhoneNumber(newPhoneNumber);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//Update the address.
	public boolean updateAddress(String contactID, String newAddress) {
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getContactID().equalsIgnoreCase(contactID)) {
				person.setAddress(newAddress);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	public void displayAll() {
		for(Contact person : contacts) {
			System.out.println(person.toString());
		}
	}
}

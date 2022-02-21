//Author Name: Mihir Patel

//Date: 1/24/2022

//Course ID: CS-320-T3692

//Description: This is the unit tests for the contact class (ContactTest).
package contact;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
	/*
	* The following tests exercise the Contact class.
	* The first 5 tests to make sure the field does not become longer than the constraint
	* (10 characters for first and last name, exactly 10 characters for phone number,
	* and 30 characters for the address).
	* The last 4 tests ensure that each field is not null.
	* ContactID is not tested for being not null because there isn't a way to create
	* a contact with a null contactID. Likewise it is not tested for being non-updateable
	* because there is no way to update it.
	*/
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("contactID","FirstName","LastName","PhoneNumber","Address");
		if(contact.getContactID().length() > 10) {
		fail("Contact ID has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact First Name cannot have more than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("contactID","OllyOllyOxenFree","LastName","PhoneNumber","Address");
		if(contact.getFirstName().length() > 10) {
		fail("First Name has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact Last Name cannot have more than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("contactID","FirstName","OllyOllyOxenFree","PhoneNumber","Address");
		if(contact.getLastName().length() > 10) {
		fail("Last Name has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact phone number is exactly 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("contactID","FirstName", "LastName", "55555555555","Address");
		if(contact.getPhoneNumber().length() != 10) {
		fail("Phone number length does not equal 10.");
		}
	}
	
	@Test
	@DisplayName("Contact address cannot have more than 30 characters")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("contactID","FirstName","LastName","PhoneNumber","123456789 is nine characters long"
		+ "123456789 is another nine characters long");
		if(contact.getAddress().length() > 30) {
		fail("Address has more than 30 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact First Name shall not be null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact("contactID",null, "LastName","PhoneNumbr","Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}
	
	@Test
	@DisplayName("Contact Last Name shall not be null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("contactID","FirstName", null,"PhoneNumber","Address");
		assertNotNull(contact.getLastName(), "Last name was null.");
	}
	
	@Test
	@DisplayName("Contact Phone Number shall not be null")
	void testContactPhoneNotNull() {
		Contact contact = new Contact("contactID","FirstName", "LastName", null,"Address");
		assertNotNull(contact.getPhoneNumber(), "Phone number was null.");
	}
	
	@Test
	@DisplayName("Contact Address shall not be null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("contactID","FirstName", "LastName","PhoneNumber",null);
		assertNotNull(contact.getAddress(), "Address was null.");
	}
}
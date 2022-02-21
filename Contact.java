//Author Name: Mihir Patel
//Date: Jan 24, 2022
//Course ID: CS-320-T3692
//Description: This is the contact class. It creates and stores contact information.

package contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//Constructor
	/*
	* The constructor takes firstName, lastName, phoneNumber, and address as parameters.
	*/
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if(contactID.length() < 10 && contactID != null) {
			this.contactID = contactID;
		}
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}
	
	//Setters
	/*
	* The setters follow the same rules as the constructor.
	*/
	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() <= 10 && phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
	}
	
	//Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Contact[contactID = " + contactID + ", firstName = " + firstName + ", lastName = " + lastName + ", phoneNumber = " + phoneNumber + ", address = " + address + "]";
	}
}

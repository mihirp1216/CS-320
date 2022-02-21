//Author Name: Mihir Patel

//Date: 1/24/2022

//Course ID: CS-320-T3692

//Description: This is the unit tests for the contact service (ContactServiceTest).

package contact;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
	
	@Test
	public void testAdd() {
		//create contact service
		ContactService contactService = new ContactService();
		
		//Test contacts
		Contact A = new Contact("A", "Luke", "Smith", "9423856843", "99 Bond Drive York PA");
		Contact B = new Contact("B", "Jessi", "Bond", "9346857832", "29 Bond Street York PA");
		
		//Test adding contacts
		assertEquals(true, contactService.addContact(A));
		assertEquals(true, contactService.addContact(B));
		
		//print all contacts
		contactService.displayAll();
	}
	
	@Test 
	public void testDelete() {
		//create contact service
		ContactService contactService = new ContactService();
		Contact A = new Contact("A", "Luke", "Smith", "9423856843", "99 Bond Drive York PA");
		Contact B = new Contact("B", "Jessi", "Bond", "9346857832", "29 Bond Street York PA");
		
		contactService.addContact(A);
		contactService.addContact(B);
		
		//testing deleting a contact
		assertEquals(true, contactService.deleteContact("A"));
		assertEquals(false, contactService.deleteContact("C"));
		
		//test results
		contactService.displayAll();
	}
	
	@Test
	public void testUpdate() {
		//create contact service
		ContactService contactService = new ContactService();
		Contact A = new Contact("A", "Luke", "Smith", "9423856843", "99 Bond Drive York PA");
		Contact B = new Contact("B", "Jessi", "Bond", "9346857832", "29 Bond Street York PA");
		
		contactService.addContact(A);
		contactService.addContact(B);
				
		//test updating info
		assertEquals(true, contactService.updateFirstName("B", "Mike"));
		assertEquals(true, contactService.updateLastName("B", "Nike"));
		assertEquals(true, contactService.updatePhoneNumber("B", "2129548588"));
		assertEquals(true, contactService.updateAddress("B", "35 Bond Lane York PA"));
		
		//test results
		contactService.displayAll();
	}

}


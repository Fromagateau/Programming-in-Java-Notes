package addr.service;

public class Person {

	private String firstName, lastName;
	private String address;
	private String phoneNumber;

	public Person() {
		this.firstName = "First";
		this.lastName = "Last";
		this.address = "Address";
		this.phoneNumber = "Phone Number";

	}

	//toString method to display all the information in an organized manner
	@Override
	public String toString() {

		return 
			"------------------------------\n"
		+	"Last Name: " + lastName + '\n'
		+ 	"First Name: " + firstName + '\n'
		+ 	"Address: " + address + '\n'
		+ 	"Phone Number: " + phoneNumber + '\n';

	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

}
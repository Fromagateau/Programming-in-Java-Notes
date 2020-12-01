


public class Person {

	private String firstName, lastName;
	private String address;
	private String phoneNumber;


	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.address = "";
		this.phoneNumber = "";

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
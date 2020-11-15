package service;
 
public class Student { //Create a student class

	static int studentCount = 0;

	//Create static fields classNumber, className, instructor
	private static String classNumber = "0001"; 
	private static String className = "Programming in Java"; //Make all fields private
	private static String instructor = "Sam Sultan";
	
	//Create instance fields studentId, firstname, lastname, address, city, state, email, etc.
	private String studentID, firstName, lastName;
	private String address, city, state; //Make all fields private
	private String email;

	//Create a constructor for the class that takes student firstname and lastname 
	public Student(String firstName, String lastName) {	

		this.firstName = firstName;
		this.lastName = lastName;

		this.address = "";
		this.city = "";
		this.state = "";
		this.email = "";
		//Constructor should generate a sequential student id (ids should start with 1000 and increment for each new student)
		this.studentID = Integer.toString(1000 + studentCount);	
		studentCount += 1;
	}

	//Create a second constructor that takes all fields (firstname, lastname, address, city, email, etc.) 
	public Student (String firstName, String lastName, String address, String city, String state, String email) {

		this(firstName, lastName);	//Constructor should call the first constructor to initialize firstname and lastname

		//Constructor should initialize the rest of the fields.
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;

	}

	//Create a toString( ) string method for the class; toString() method should output all fields, including studentId, name, instructor, className, etc. 
	@Override
	public String toString() {
		return "Student Count: " + studentCount + '\n'
		+ "Class Number: " + classNumber + '\n'
		+ "Class Name: " + className + '\n' 
		+ "Instructor: " + instructor + '\n'
		+ "Student ID: " + studentID + '\n' 
		+ "Name: " + firstName + " " + lastName + '\n' 
		+ "Address: " + address + '\n'
		+ "City: " + city + '\n'
		+ "State: " + state + '\n'
		+ "Email: " + email + '\n';
}


	//Create getter and setter methods for the static fields
	public void setClassNumber(String newClassNumber) {
		classNumber = newClassNumber;
	}
	
	public String getClassNumber() {
		return classNumber;
	}
	
	public void setClassName(String newClassName) {
		className = newClassName;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setInstructor(String newInstructor) {
		instructor = newInstructor;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	//Create getter and setter methods for the instance fields
	public void setStudentID(String newStudentID) {
		this.studentID = newStudentID;
	}
	
	public String getStudentID() {
		return this.studentID;
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
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	
	public String getCity() {
		return this.city;
	}

	public void setState(String newState) {
		this.state = newState;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}

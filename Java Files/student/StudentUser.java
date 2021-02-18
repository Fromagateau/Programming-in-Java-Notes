import service.*;

//Create a second class that will use the student class
public class StudentUser {

	public static void main(String[] args) {
	
	//Instantiate at least 5 objects of the student class, some using the small constructor and some using the large one.
	Student Ryan = new Student("Ryan", "Soeyadi", "99 Grove Street", "Blah", "NY", "rds@school.edu");
	Student John = new Student("John", "Shinsdler", "Hey Street", "Gaway", "WI", "jms@school.edu");
	Student Joh = new Student("Joh", "Samith", "33 Lincoln Center Plaza", "Juilliard", "NY", "johsamith@school.edu");
	Student Martin = new Student("Martin", "Matti");
	Student Smith = new Student("Smith", "Will");

	//Print out the 5 objects using the toString( ) method
	System.out.println(Ryan);
	System.out.println(John);
	System.out.println(Joh);
	System.out.println(Martin);
	System.out.println(Smith);

	//Call getters and setters to alter some student information (e.g. firstname, address, etc.)
	Ryan.setCity("Blue");
	John.setEmail("johns8pm@school.edu");
	Joh.setAddress("35 Lincoln Center Plaza");
	Martin.setState("ME");
	Smith.setFirstName("Willy");

	//reprint the 5 objects
	System.out.println("Ryan lives in " + Ryan.getCity() + " now");
	System.out.println(John.getEmail());
	System.out.println(Joh.getAddress());
	System.out.println(Martin.getState());
	System.out.println(Smith.getFirstName());



}
}
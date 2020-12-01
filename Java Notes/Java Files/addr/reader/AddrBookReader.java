package addr.reader;
import addr.service.Person;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddrBookReader {

	public static void main(String[] args) {

		try {

			File addressBook = new File("/Users/ryansoeyadi/Desktop/Java Notes/Java Files/addr/zAddrBook.txt");	//open file
			Scanner addressScanner = new Scanner(addressBook);	//create scanner instance to read file
			
			String nextLine = addressScanner.nextLine(); //store each line in var nextLine
			// System.out.println(nextLine);

			String[] components = nextLine.split(",");	//break up the line according to comma delimiter

			//assign each component to a variable
			String lastName = components[0];
			String firstName = components[1];
			String address = components[2] + ", " + components[3] + ", " + components[4] + " " + components[5];
			String phoneNumber = components[6];

			//create instance and set components to Person object
			Person person = new Person();
			person.setLastName(lastName);
			person.setFirstName(firstName);
			person.setAddress(address);
			person.setPhoneNumber(phoneNumber);

			System.out.println(person.toString());

	}	catch (FileNotFoundException exception) {
			Logger.getLogger(AddrBookReader.class.getName()).log(Level.SEVERE, null, exception);
	}


}

}
package addr.reader;
import addr.service.Person;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddrBookReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		read("/Users/ryansoeyadi/Desktop/Java Notes/Java Files/addr/zAddrBook.txt");
	}

	public static void read(String fileName) {

		String[] components = new String[1000];

		try 
		{

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		

		//go through line by line, separate by commas, and add each element to the components array
		String line; int i = 0;
		StringTokenizer st;
		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line, ",");

			while (st.hasMoreTokens()) {
				components[i] = st.nextToken();
				i++;
			}
		}

		}

		catch (Exception e) {
			  System.out.println(e.getClass());
		}

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

	}	


}


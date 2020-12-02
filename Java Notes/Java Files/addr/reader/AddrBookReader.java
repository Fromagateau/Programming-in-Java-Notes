package addr.reader;
import addr.service.Person;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddrBookReader {

  public static void read(String fileName) {

  	//prompt user for the person they're looking for
  	String wantedPerson = promptForName();

  	//read the file
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(fileName));
    }
    catch(Exception e) {
      System.out.println(e.getClass());
    }

    //after the person is found, create an array to store components of their information from their line within the .txt file
    String[] components = search(br, wantedPerson);

    //if the person was not found, finish and present a "no match" message
    if (components[0] == null) {
      System.out.println("No Match Found");
    }

    //if the person was found, set each component to a variable 
    else {
      String lastName = components[0];
      String firstName = components[1];
      String address = components[2] + ", " + components[3] + ", " + components[4] + " " + components[5];
      String phoneNumber = components[6];

      //create instance of Person() and set components to Person instance fields
      Person person = new Person();
      person.setLastName(lastName);
      person.setFirstName(firstName);
      person.setAddress(address);
      person.setPhoneNumber(phoneNumber);

      //finally, display everything
      System.out.println(person.toString());
    }

  }

  //search function to find person in .txt file
  public static String[] search(BufferedReader br, String wantedPerson) {

    String[] components = new String[7]; //there will be 7 components that make up each person's information in the .txt
    //go through line by line, separate by commas, and add each element to the components array
    String line;
    StringTokenizer st;

    try {
      while ((line = br.readLine()) != null) {

        String[] tmpWords = line.split(",");

        //compare the names
        for (int i = 0; i < tmpWords.length; i++) {
          if ((tmpWords[i].toLowerCase().indexOf(wantedPerson.toLowerCase())) == 0) { //case insensitive and works with partial name
          	wantedPerson = tmpWords[i];
            st = new StringTokenizer(line, ",");

            while (st.hasMoreTokens()) {
           
            components[i] = st.nextToken();
			i++;
            }
          }

          else {
          	break; //if there's no match, exit the loop completely and just return the array we have
          }
        }
      }

    }

    catch(Exception e) {
      e.printStackTrace();
    }

    return components;
  }

  //prompt the user for the person they're looking for 
  private static String promptForName() {

	    Scanner prompter = new Scanner(System. in );
	    System.out.print("Last Name: ");
	    String lastName = prompter.nextLine();
	   
	   	return lastName;

  }

}
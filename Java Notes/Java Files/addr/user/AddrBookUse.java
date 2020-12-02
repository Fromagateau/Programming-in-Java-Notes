package addr.user;
import addr.service.Person;
import addr.reader.AddrBookReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddrBookUse {

  public static void main(String[] args) throws FileNotFoundException, IOException {

    AddrBookReader reader = new AddrBookReader();
    reader.read("/Users/ryansoeyadi/Desktop/Java Notes/Java Files/addr/zAddrBook.txt");
  }

}
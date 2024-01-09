import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelephoneDirectoryManager {

    private static long ID = 100;

    private ArrayList<Contacts> contactList;
    private Scanner input;

    public TelephoneDirectoryManager() {
        contactList = new ArrayList<>();
        input = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("	 Welcome to the Telephone Directory System!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Below is a list of available options:");
        System.out.println("1. Add a Contact");
        System.out.println("2. Delete a Contact");
        System.out.println("3. View Records");
        System.out.println("4. Update a Record");
        System.out.println("5. Sort all Records in Ascending Order");
        System.out.println("6. Create A Group");
        System.out.println("7. View Recent Birthdays");
        System.out.println("8. Search by Name");
        System.out.println("9. Quit");
        System.out.println("Input your desired option number below:");
    }
}
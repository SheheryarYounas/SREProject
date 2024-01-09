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

    private void addContact() throws ParseException {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Type in the following information:");
        System.out.println("Enter First Name of Contact:");
        input.nextLine();
        String fname = input.nextLine();

        System.out.println("Enter Last Name of Contact:");
        String lname = input.nextLine();

        System.out.println("Enter Phone Number of Contact:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter Name of City:");
        String cityname = input.nextLine();

        System.out.println("Enter Name of Country:");
        String country = input.nextLine();

        System.out.println("Enter Residential Address:");
        String address = input.nextLine();

        System.out.println("Enter Name of Website:");
        String website = input.nextLine();

        System.out.println("Enter Mobile Number: ");
        String mobile = input.nextLine();

        System.out.println("Enter Name of Company:");
        String company = input.nextLine();

        System.out.println("Enter Birthday in DD-MM-YYYY");
        String birthday = input.nextLine();
        SimpleDateFormat sobj = new SimpleDateFormat("dd-MM-yyyy");
        sobj.parse(birthday);
        Contacts contact = new Contacts(fname, lname, phoneNumber, cityname, country, address, website, mobile, company, "-", ID, birthday);
        contactList.add(contact);
        ID++;

        System.out.println("-----------------------------------------------------------");
        System.out.println("        Contact Added Successfully to Record");
        System.out.println("-----------------------------------------------------------");
    }

      private void deleteContact() {
        System.out.println("Enter the first name of the contact you wish to delete:");
        String deleteName = input.next();
        System.out.println("Enter the last name of the contact you wish to delete:");
        String deleteLastName = input.next();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getfName().equals(deleteName) && contactList.get(i).getlName().equals(deleteLastName)) {
                contactList.remove(i);
                System.out.println("-----------------------------------------------------------");
                System.out.println("        Contact Deleted Successfully from Record");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

    private void viewRecords() {
        System.out.println("View all contacts");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i).getfName() + " " + contactList.get(i).getlName());
        }
    }

}
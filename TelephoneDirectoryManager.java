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

    private void updateRecord() {
        System.out.println("Enter the first name of the contact you wish to update:");
        String updateName = input.next();
        System.out.println("Enter the last name of the contact you wish to update:");
        String updateLastName = input.next();
        System.out.println("Enter the field you wish to update:");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Phone Number");
        System.out.println("4. City");
        System.out.println("5. Country");
        System.out.println("6. Address");
        System.out.println("7. Website");
        System.out.println("8. Mobile");
        System.out.println("9. Company");
        System.out.println("10. Group");
        System.out.println("11. Birthday");
        int option2 = input.nextInt();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getfName().equals(updateName) && contactList.get(i).getlName().equals(updateLastName)) {
                switch (option2) {
                    case 1:
                        System.out.println("Enter the new first name:");
                        String newFirstName = input.next();
                        contactList.get(i).setfName(newFirstName);
                        break;
                    case 2:
                        System.out.println("Enter the new last name:");
                        String newLastName = input.next();
                        contactList.get(i).setlName(newLastName);
                        break;
                    case 3:
                        System.out.println("Enter the new phone number:");
                        String newPhoneNumber = input.next();
                        contactList.get(i).setPhoneNumber(newPhoneNumber);
                        break;
                    case 4:
                        System.out.println("Enter the new city:");
                        String newCity = input.next();
                        contactList.get(i).setCity(newCity);
                        break;
                    case 5:
                        System.out.println("Enter the new country:");
                        String newCountry = input.next();
                        contactList.get(i).setCountry(newCountry);
                        break;
                    case 6:
                        System.out.println("Enter the new address:");
                        String newAddress = input.next();
                        contactList.get(i).setAddress(newAddress);
                        break;
                    case 7:
                        System.out.println("Enter the new website:");
                        String newWebsite = input.next();
                        contactList.get(i).setWebsite(newWebsite);
                        break;
                    case 8:
                        System.out.println("Enter the new mobile:");
                        String newMobile = input.next();
                        contactList.get(i).setMobile(newMobile);
                        break;
                    case 9:
                        System.out.println("Enter the new company:");
                        String newCompany = input.next();
                        contactList.get(i).setCompany(newCompany);
                        break;
                    case 10:
                        System.out.println("Enter the new group:");
                        String newGroup = input.next();
                        contactList.get(i).setGroup(newGroup);
                        break;
                    case 11:
                        System.out.println("Enter the new birthday:");
                        String newBirthday = input.next();
                        contactList.get(i).setBirthday(newBirthday);
                        break;
                    default:
                        System.out.println("Invalid option selected");
                        break;
                }
            }
        }
    }
    
     private void sortRecords() {
        System.out.println("Sort all records in ascending order");

        for (int i = 0; i < contactList.size(); i++) {
            for (int j = 0; j < contactList.size(); j++) {
                if (contactList.get(i).getfName().compareTo(contactList.get(j).getfName()) < 0) {
                    Contacts temp = contactList.get(i);
                    contactList.set(i, contactList.get(j));
                    contactList.set(j, temp);
                }
            }
        }
    }

    private void createGroup() {
        System.out.println("Create a group");
        System.out.println("1. Create a new group");
        System.out.println("2. Add a contact to a group");
        int option3 = input.nextInt();
        switch (option3) {
            case 1:
                System.out.println("Enter the name of the group you wish to create:");
                String newGroup = input.next();
                Groups group = new Groups(newGroup);
                break;
            case 2:
                System.out.println("Enter the name of the group you wish to add a contact to:");
                String addGroup = input.next();
                System.out.println("Enter the first name of the contact you wish to add:");
                String addFirstName = input.next();
                System.out.println("Enter the last name of the contact you wish to add:");
                String addLastName = input.next();
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i).getfName().equals(addFirstName) && contactList.get(i).getlName().equals(addLastName)) {
                        contactList.get(i).setGroup(addGroup);
                    }
                }
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }
    }

    private void viewRecentBirthdays() {
        System.out.println("View recent birthdays");
        System.out.println("Viewing birthdays for the past 30 days");

        for (int i = 0; i < contactList.size(); i++) {
            String[] birthdays = contactList.get(i).getBirthday().split("-");
            int day = Integer.parseInt(birthdays[0]);
            int month = Integer.parseInt(birthdays[1]);
            int year = Integer.parseInt(birthdays[2]);
            Calendar cal = Calendar.getInstance();
            cal.set(year, month, day);
            cal.add(Calendar.DATE, -30);
            Date dateBefore30Days = cal.getTime();
            Date currentDate = new Date();
            if (dateBefore30Days.compareTo(currentDate) < 0) {
                System.out.println(contactList.get(i).getfName() + " " + contactList.get(i).getlName());
            }
        }
    }

     private void searchByName() {
        System.out.println("Search by name");
        System.out.println("Enter first name");
        String searchFirstName = input.next();
        System.out.println("Enter last name");
        String searchLastName = input.next();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getfName().equals(searchFirstName) && contactList.get(i).getlName().equals(searchLastName)) {
                System.out.println(contactList.get(i).getfName() + " " + contactList.get(i).getlName());
            }
        }
    }

    public void run() throws ParseException {
        int option;

        do {
            displayMenu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    viewRecords();
                    break;
                case 4:
                    updateRecord();
                    break;
                case 5:
                    sortRecords();
                    break;
                case 6:
                    createGroup();
                    break;
                case 7:
                    viewRecentBirthdays();
                    break;
                case 8:
                    searchByName();
                    break;
                default:
                    System.out.println("Invalid Option Selected");
            }

        } while (option != 9);
    }

    public void addContactForTesting() throws ParseException {
        addContact();
    }

    public void deleteContactForTesting() {
        deleteContact();
    }

    public ArrayList<Contacts> getContactListForTesting() {
        return contactList;
    }
}
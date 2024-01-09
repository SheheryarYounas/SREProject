import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.List;

public class TelephoneDirectoryManagerTest {

    public static void main(String[] args) throws ParseException {
        testAddContact();
        testDeleteContact();
        // Add more test methods as needed
    }

    public static void testAddContact() throws ParseException {
        TelephoneDirectoryManager directoryManager = new TelephoneDirectoryManager();

        // Set up InputStream to provide input for the test
        String input = "John\nDoe\n1234567890\nCity\nCountry\nAddress\nexample.com\n9876543210\nCompany\n01-01-2000\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Add a contact
        directoryManager.addContactForTesting();

        // Check if the contact has been added to the list
        List<Contacts> contactList = directoryManager.getContactListForTesting();
        assert contactList.size() == 1;
        assert "John".equals(contactList.get(0).getfName());
        assert "Doe".equals(contactList.get(0).getlName());
        assert "1234567890".equals(contactList.get(0).getPhoneNumber());
    }

    public static void testDeleteContact() {
        TelephoneDirectoryManager directoryManager = new TelephoneDirectoryManager();

        // Add some contacts to the list for testing
        Contacts contact1 = new Contacts("John", "Doe", "1234567890", "City", "Country", "Address", "example.com", "9876543210", "Company", "-", 100, "01-01-2000");
        Contacts contact2 = new Contacts("Jane", "Doe", "9876543210", "City", "Country", "Address", "example.com", "1234567890", "Company", "-", 101, "01-02-2000");
        directoryManager.getContactListForTesting().add(contact1);
        directoryManager.getContactListForTesting().add(contact2);

        // Set up InputStream to provide input for the test
        String input = "John\nDoe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Delete a contact
        directoryManager.deleteContactForTesting();

        // Check if the contact has been removed from the list
        List<Contacts> remainingContacts = directoryManager.getContactListForTesting();
        assert remainingContacts.size() == 1;
        assert "Jane".equals(remainingContacts.get(0).getfName());
    }

}

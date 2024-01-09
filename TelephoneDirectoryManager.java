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
}
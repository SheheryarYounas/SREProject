import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;



public class Main {
	
	private static long ID = 100;


	public static void main(String[] args) throws ParseException { 
		
		int option;
		int option2;
		int index;
		int option3;
		int option4;
		String key;
		
		Scanner input = new Scanner(System.in);
		ArrayList<Contacts> contactList = new ArrayList<Contacts>();
		Contacts contact1;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("	 Welcome to the Telephone Directory System!");
		System.out.println("-----------------------------------------------------------");
		do
		{ //Start of first do
			System.out.println("Below is a list of available options:");
			System.out.println("1. Add a Contact");
			System.out.println("2. Delete a Contact");
			System.out.println("3. View Records");
			System.out.println("4. Update a Record");
			System.out.println("5. Sort all Records in Ascending Order");
			System.out.println("6. Create A Group");
			System.out.println("7. View Recent Birthdays");
			System.out.println("8. Quit");
			System.out.println("Input your desired option number below:");
			option = input.nextInt();
			
			if (option < 1 || option > 9)
			{
				System.out.println("No such option exists. Returning to Menu...");
			}
			
			switch (option)
			{ //Start of first switch
				case 1:
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
					
					break; //End of Case 1
					
				case 2:
					//Delete a contact by name
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
					
				case 3:
					System.out.println("View all contacts");
					for (int i = 0; i < contactList.size(); i++) {
						System.out.println(contactList.get(i).getfName() + " " + contactList.get(i).getlName());
					}
					break;
					
				case 4:
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
					option2 = input.nextInt();

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
					break;
					
				case 5:
					contacts.SelectionSort();
					break;
					
				case 6:
					Boolean cont = true;
					System.out.println("Enter Group Name:");
					input.nextLine();
					String group = input.nextLine();
					function.Iterate(contacts, 1);
					function.getInfo(contacts.getSize(), contacts, 1);
					
					while (cont == true)
					{
						System.out.println("Enter ID's of Contacts to Add to this Group");
						String ID = input.next();
						index = function.BinarySearch(ID);
						((Contacts) contacts.getMyArray()[index]).setGroup(group);
						System.out.println("Add Another? (Y/N)");
						String contin = input.next();
						if (contin.equals("Y"))
						{
							cont = true;
						}
						else
						{
							cont = false;
						}
					}
					
					break;
					
					
				case 7:
					contacts.SelectionSortDate();
					break;
					
				case 8:
					System.out.println("Quitting...");
					break;
					
				default:
					System.out.println("Invalid Option Selected");
					
					
					
					
					
				
			} //End of switch
			
		} while (option != 8); //End of first do
		
				

	} //End of Main Function


} //End of Class

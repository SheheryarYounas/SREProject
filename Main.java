import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



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
		GenericArrayList contacts = new GenericArrayList();
		UserFunctions function = new UserFunctions();
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
					contacts.Add(contact);
					ID++;
					
					System.out.println("-----------------------------------------------------------");
					System.out.println("        Contact Added Successfully to Record");
					System.out.println("-----------------------------------------------------------");
					
					break; //End of Case 1
					
				case 2:
					function.Iterate(contacts, 2);
					System.out.println("1. Remove by ID\n2. Remove by Name");
					option2 = input.nextInt();
					
					if (option2 == 1)
					{
						System.out.println("Enter the ID:");
						key = input.next();
						option3 = 1;
					}
					
					else
					{
						System.out.println("1. Search by First Name");
						System.out.println("2. Search by Last Name");
						option4 = input.nextInt();
						
						if (option4 == 1)
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 2;
						}
						
						else 
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 3;
						}
						
						
					}
					
					function.getInfo(contacts.getSize(), contacts, option3);
					index = function.BinarySearch(key);
					if (index == - 1)
					{
						System.out.println("Error! Add Element");
						break;
					}
					contacts.Remove(index);
					break;
					
				case 3:
					System.out.println("1. View Specific ID\n2. View Specific Contact by Name\n3. Print All Contacts in Tabular Form");
					option2 = input.nextInt();
					
					
					if (option2 == 1)
					{
						System.out.println("Enter the ID:");
						key = input.next();
						option3 = 1;
						
						function.getInfo(contacts.getSize(), contacts, option3);
						index = function.BinarySearch(key);
						if (index == - 1)
						{
							System.out.println("Error! Add Element");
							break;
						}
						contact1 = (Contacts) contacts.getMyArray()[index];
						System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "ID", "FIRST NAME", "LAST NAME", "PHONE NUMBER", "CITY", "COUNTRY", "ADDRESS", "WEBSITE", "MOBILE", "COMPANY", "GROUP");
						System.out.println();
						System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", contact1.getUniqueID(), contact1.getfName(), contact1.getlName(), contact1.getPhoneNumber(), contact1.getCity(), contact1.getCountry(), contact1.getAddress(), contact1.getWebsite(), contact1.getMobile(), contact1.getCompany(), contact1.getGroup());
						System.out.println();
						System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						
					}
					
					else if (option2 == 2)
					{
						System.out.println("1. Search by First Name");
						System.out.println("2. Search by Last Name");
						option4 = input.nextInt();
						
						if (option4 == 1)
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 2;
							function.getInfo(contacts.getSize(), contacts, option3);
							index = function.BinarySearch(key);
							if (index == - 1)
							{
								System.out.println("Error! Add Element");
								break;
							}
							contact1 = (Contacts) contacts.getMyArray()[index];
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "ID", "FIRST NAME", "LAST NAME", "PHONE NUMBER", "CITY", "COUNTRY", "ADDRESS", "WEBSITE", "MOBILE", "COMPANY", "GROUP");
							System.out.println();
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", contact1.getUniqueID(), contact1.getfName(), contact1.getlName(), contact1.getPhoneNumber(), contact1.getCity(), contact1.getCountry(), contact1.getAddress(), contact1.getWebsite(), contact1.getMobile(), contact1.getCompany(), contact1.getGroup());
							System.out.println();
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							
						}
						
						else 
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 3;
							function.getInfo(contacts.getSize(), contacts, option3);
							index = function.BinarySearch(key);
							if (index == - 1)
							{
								System.out.println("Error! Add Element");
								break;
							}
							contact1 = (Contacts) contacts.getMyArray()[index];
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "ID", "FIRST NAME", "LAST NAME", "PHONE NUMBER", "CITY", "COUNTRY", "ADDRESS", "WEBSITE", "MOBILE", "COMPANY", "GROUP");
							System.out.println();
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", contact1.getUniqueID(), contact1.getfName(), contact1.getlName(), contact1.getPhoneNumber(), contact1.getCity(), contact1.getCountry(), contact1.getAddress(), contact1.getWebsite(), contact1.getMobile(), contact1.getCompany(), contact1.getGroup());
							System.out.println();
							System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							
						}
						
						
					}
					
					else
					{
						function.Iterate(contacts, 1);
					}
					
					break;
					
				case 4:
					System.out.println("1. Enter Specific ID\n2. Enter Specific Contact Name");
					option2 = input.nextInt();
					int error3 = 0;
					
					if (option2 == 1)
					{
						System.out.println("Enter the ID:");
						key = input.next();
						option3 = 1;
						
						function.getInfo(contacts.getSize(), contacts, option3);
						index = function.BinarySearch(key);
						if (index == - 1)
						{
							System.out.println("Error! Not Found");
							error3 = 1;
							break;
						}
						
						
					}
					
					else
					{
						System.out.println("1. Search by First Name");
						System.out.println("2. Search by Last Name");
						option4 = input.nextInt();
						
						if (option4 == 1)
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 2;
							function.getInfo(contacts.getSize(), contacts, option3);
							index = function.BinarySearch(key);
							if (index == - 1)
							{
								System.out.println("Error! Add Element");
								error3 = 1;
								break;
							}
						}
						
						else 
						{
							System.out.println("Enter Name:");
							key = input.next();
							option3 = 3;
							function.getInfo(contacts.getSize(), contacts, option3);
							index = function.BinarySearch(key);
							if (index == - 1)
							{
								System.out.println("Error! Add Element");
								error3 = 1;
								break;
							}
						}
						
						
					}
					
					if (error3 == 0)
					{
						System.out.println("1. Modify First Name");
						System.out.println("2. Modify Last Name");
						System.out.println("3. Change Entire Contact Details");
						option4 = input.nextInt();
						if (option4 == 1)
						{
							contact1 = (Contacts) contacts.getMyArray()[index];
							System.out.println("Enter New First Name");
							String NewFName = input.next();
							contact1.setfName(NewFName);
						}
						
						if (option4 == 2)
						{
							contact1 = (Contacts) contacts.getMyArray()[index];
							System.out.println("Enter New Last Name");
							String NewLName = input.next();
							contact1.setlName(NewLName);
						}
						
						if (option4 == 3)
						{
							System.out.println("Enter First Name of Contact:");
							input.nextLine();
							String newfname = input.nextLine();
							
							System.out.println("Enter Last Name of Contact:");
							String newlname = input.nextLine();
							
							System.out.println("Enter Phone Number of Contact:");
							String newphoneNumber = input.nextLine();
							
							System.out.println("Enter Name of City:");
							String newcityname = input.nextLine();
							
							System.out.println("Enter Name of Country:");
							String newcountry = input.nextLine();
							
							
							System.out.println("Enter Residential Address:");
							String newaddress = input.nextLine();
					        
							System.out.println("Enter Name of Website:");
							String newwebsite = input.nextLine();
							
							System.out.println("Enter Mobile Number: ");
							String newmobile = input.nextLine();
							
							System.out.println("Enter Name of Company:");
							String newcompany = input.nextLine();
							
							
							contact1 = (Contacts) contacts.getMyArray()[index];
							contact1.setfName(newfname);
							contact1.setlName(newlname);
							contact1.setPhoneNumber(newphoneNumber);
							contact1.setAddress(newaddress);
							contact1.setCity(newcityname);
							contact1.setCompany(newcompany);
							contact1.setMobile(newmobile);
							contact1.setWebsite(newwebsite);
						}
					}
					else
					{
						System.out.println("Error!");
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

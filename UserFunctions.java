import java.util.Scanner;

public class UserFunctions  {
	
		private String information[];
		Scanner input = new Scanner(System.in);
		
		
		public void Iterate(GenericArrayList contacts, int option)
		{
			Iterator iterator = new Iterator(contacts.Iterator());
			Contacts contact1;
			if (option == 1)
			{
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "ID", "FIRST NAME", "LAST NAME", "PHONE NUMBER", "CITY", "COUNTRY", "ADDRESS", "WEBSITE", "MOBILE", "COMPANY", "GROUP");
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			while (iterator.hasNext())
			{
				contact1 = (Contacts) iterator.next();
				System.out.printf("%5s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", contact1.getUniqueID(), contact1.getfName(), contact1.getlName(), contact1.getPhoneNumber(), contact1.getCity(), contact1.getCountry(), contact1.getAddress(), contact1.getWebsite(), contact1.getMobile(), contact1.getCompany(), contact1.getGroup());
				System.out.println();
										
			}
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			}
			
			else
			{
				while (iterator.hasNext())
				{
					contact1 = (Contacts) iterator.next();
					System.out.println("ID: " + contact1.getUniqueID() + " Name: " + contact1.getfName() + " " + contact1.getlName());
				}
			}
		}
		
		public int BinarySearch(String element)
		{
			int first;
			int last;
			int option;
			
			if (information.length > 1)
			{
				first = 0;
				last = information.length - 1;
				
				while(first <= last)
				{
					Contacts contact;
					int mid = first + (last - first) / 2;
					
					int check = element.compareTo(information[mid]);
					
					if (check == 0)
					{
						return mid;
						
					}
					
					if (check > 0)
					{
						first = mid + 1;
					}
					
					else
					{
						last = mid - 1;
					}
					
					
				}
				
				
			}
			else if (information.length == 1)
			{
				return 0;
			}
			else if (information.length < 1)
			{
				System.out.println("Add Elements First");
			}
			return -1;
					
		}
		
		public void getInfo(int size, GenericArrayList contacts, int option)
		{
			information = new String[size];
			Iterator iterator = new Iterator(contacts.Iterator());
			Contacts contact1;
			int i = 0;
			
			while (iterator.hasNext())
			{
				contact1 = (Contacts) iterator.next();
				
				if (option == 1)
				{
					information[i++] = contact1.getUniqueID();	
				}
				else if (option == 2)
				{
					information[i++] = contact1.getfName();
				}
				
				else if (option == 3)
				{
					information[i++] = contact1.getlName();
				}
			}
		}
		
		
		
		
			
			
			
		
		
}	


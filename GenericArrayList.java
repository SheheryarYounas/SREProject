
public class GenericArrayList <T> 
{
	private T myArray[];
	private int size;
	private int index;
	
	public GenericArrayList()
	{
		this.index = 0;
		this.size = 1;
		myArray = (T[]) new Object[size];
	}
	
	public void Add(T element)
	{
		if (index < size)
		{
			myArray[index] = element;
			index = index + 1;
		}
		
		else
		{
			DynamicSizeAllocator(element);
			index = index + 1;
		}
	}
	
	public void Add(int index, T element)
	{
		int length = size + 1;
		T myArray2[] = (T[]) new Object[length];
		
		for (int i = 0; i < length; i = i + 1)
		{
			if (i < index)
			{
				myArray2[i] = myArray[i];
			}
			
			else if (i == index)
			{
				myArray2[i] = element;
			}
			
			else
			{
				myArray2[i] = myArray[i - 1];
			}
		}
		
		myArray = myArray2;
		size = length;
	}
	
	public void Remove(int index)
	{
		
		T myArray2[] = (T[]) new Object[size - 1];
		
		if (index < size)
		{
			
		for (int i = 0, j = 0; i < myArray.length; i = i + 1, j = j + 1)
		{
			
			if (i == index)
			{
				j--;
			}
			
			else
			{
				myArray2[j] = myArray[i];
				
			}
			
			
		}
		myArray = myArray2;
		size = size - 1;
		}
		
		else
		{
			System.out.println("This index position does not exist");
		}
	}
	
	public void DynamicSizeAllocator(T element)
	{
		int length = size + 1;
		
		T myArray2[] = (T[]) new Object[length];
		
		for (int i = 0; i < size; i = i + 1)
		{
			myArray2[i] = myArray[i];
		}
		
		myArray2[size] = element;
		size = length;
		myArray = myArray2;
		
	}
	
	public Object[] Iterator()
	{
		return myArray;
	}

	public Object[] getMyArray() {
		return myArray;
	}

	public void setMyArray(T[] myArray) {
		this.myArray = myArray;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void SelectionSort()
	{
		Object temp;
		String temp2;
		String temp3;
		
		for(int i = 0; i < myArray.length - 1; i++)
	    {
			
	        int min_index = i;
	        String minStr = ((Contacts) myArray[i]).getfName();
	        for(int j = i + 1; j < myArray.length; j++)
	        {
	            
	         
	            if(((Contacts) myArray[j]).getfName().compareTo(minStr) < 0)
	            {
	                minStr = ((Contacts) myArray[j]).getfName();
	                min_index = j;
	            }
	        }
	 
	    if(min_index != i)
	    {
	    	temp = myArray[min_index];
	    	temp2 = ((Contacts) myArray[min_index]).getUniqueID();
	    	temp3 = ((Contacts) myArray[i]).getUniqueID();
	    	((Contacts) myArray[min_index]).setUniqueID(temp3);
	    	((Contacts) myArray[i]).setUniqueID(temp2);
	        myArray[min_index] = myArray[i];
	        
	        myArray[i] = (T) temp;
	        
	    }
	    }
	}
	
	public void SelectionSortDate()
	{
		String temp;
		String temp2;
		String temp3;
		
		String birthday[] = new String[myArray.length];
		String firstNames[] = new String[myArray.length];
		
		for(int i = 0; i < myArray.length; i++)
	    {
		
			birthday[i] = ((Contacts) myArray[i]).getBirthday();
			firstNames[i] = ((Contacts) myArray[i]).getfName();
	    }
		
		for(int i = 0; i < myArray.length - 1; i++)
	    {
	     
	        int min_index = i;
	        String minStr = birthday[i];
	        for(int j = i + 1; j < myArray.length; j++)
	        {
	         
	            if(birthday[j].compareTo(minStr) < 0)
	            {
	                minStr = birthday[j];
	                min_index = j;
	            }
	        }
	        
	        if (min_index != i)
	        {
	            String tempo = birthday[min_index];
	            String tempo2 = firstNames[min_index];
	            birthday[min_index] = birthday[i];
	            firstNames[min_index] = firstNames[i];
	            birthday[i] = tempo;
	            firstNames[i] = tempo2;
	        }
	        
	       
		
	    }
		
		 for (int i = 0; i < myArray.length; i = i + 1)
	        {
	        	System.out.println(firstNames[i] + "'s Birthday on: " + birthday[i].substring(0, 5));
	        	
	        }
	}
	
	
	
}

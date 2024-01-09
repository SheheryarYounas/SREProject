
public class Iterator <T> {

	private T myArray[];
	private int i = 0;
	
	public Iterator(T myArray[])
	{
		this.myArray = myArray; 
	}
	
	public boolean hasNext()
	{
		if (i < myArray.length)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public Object next()
	{
		return myArray[i++];
	}
}

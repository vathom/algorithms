//Find popular item in sorted array of natural numbers. 
//An item is popular is if its repeated n/4 times or more. 
//For Ex: 
//Input: 123444445678 
//Popular item is 4. 
//Liner scan is O(n), but solution needs to be in O(logN) complexity and O(1) space complexity.


public sealed class PopularItem
{
	public static void Main(String[] args)
	{
		
	}
	
	public static int Get(int[] items, int popScore)
	{
		if(items == null || items.Count <=0)
		{
			throw new ArgumentNullException("Argument 'items' is null");
		}
		
		if(popScore > items.Length)
		{
			return -1;
		}
		
		return Get(items, popScore, 0, items.Length-1);
	}
	
	public static int Get(int[] items, popScore, int left, int right)
	{	
		if(right < left)
		{	
			return -1;	
		}
		
		int mid = (left + right) / 2;
		int current = items[mid];
		
		int iterator = mid - popScore + 1;
		
		while(iterator <= mid)
		{
			if(items[mid] == items[iterator] && items[mid] ==items[iterator + popScore - 1])
			{
				return items[mid];
			}
			iterator++;
		}
		
		
	}
	
}



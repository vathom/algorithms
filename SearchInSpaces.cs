//Given sorted array of string with spaces find a given string - [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”]

class Program
{	
	public static void Main(String[] args)
	{	
	
	}
	
	public int Search(string[] input, string str)
	{
		if(input == null || input.Count() <= 0)
		{
			return -1;
		}
		
		if(str == "")
		{	
			//How to search an empty string
		}
		
		return Search(input, str, 0, input.Length-1);
	}
	
	private int Search(string[] input, string str, int left, int right)
	{
		if(right < left)
		{	
			return -1;
		}
		
		int mid = (left + right) / 2;
		bool found = false;
			
		if(input[mid] == "")
		{
			int toleft = mid-1;
			int toright = mid+1;
		
			while(toleft>=left && toright<=right && !found)
			{
				if(input[toleft] == "")
				{	
					toleft--;
				}
				else
				{
					mid = toleft;
					found = true;
				}
				
				if(input[toright] == "")
				{
					toright++;
				}
				else
				{
					mid = toright;
					found = true;
				}
			}
		}
		
		if(input[mid] == str)
		{	
			return mid;
		}
		else if(input[mid].CompareTo(str) > 0)
		{
			return Search(input, str, 0, mid-1);
		}
		else
		{
			return Search(input, str, mid+1, right);
		}
	}
}
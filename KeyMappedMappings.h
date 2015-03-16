class Program
{
	public static void Main()
	{
		
	}
	
	public static List<string> GetCombinations(string str)
	{
		if(input == null)
		{
			return new List<string>();
		}
		
		List<string> combinations = new List<string>();
		
		if(str.Length == 0 || (str.Length == 1 && str[0] == '#')
		{
			combinations.Add("");
			return combinations;
		}
		
		char first = str[0];
		string remainder = str.Substring(1);
		
		List<string> remCombination = GetCombinations(remainder);
		List<char> mappedChars = GetAllMapping(first);
		
		for(int i=0; i<mappedChars.Length; i++)
		{
			for(j=0; j<remCombination.Length; j++)
			{
				combinations.Add(mappedChars[i].ToString() + remCombination[j]);
			}
		}
		
		return combinations;
	}
	
	public static List<char> GetAllMapping(char c)
	}
	{
}


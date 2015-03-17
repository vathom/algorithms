public Class ExpressionParser
{
    public static void main(String[] args)
    {
	String expression = "((a,b)o(m,n)p,b)";
	ArrayList<String> parsed = parse(expression);
    }
        
        
    public static ArrayList<String> parse(String exp)
    {
	if(str == null || str == "")
            {
                return new ArrayList<String>(){''};
            }
            
	if(!str.contains(','))
            {
                return new ArrayList<String>(){exp};
            }
            
	List<string> all = new List<string>();
            
	List<string> multipliers = GetMultipliers(exp);
            
	if(multipliers.Count == 1)
            {
                List<string> components = GetComponents(exp);
                foreach(string component in components)
		    {
			if(!component.Contains(','))
			    {
				all.Add(component);
			    }
                    
			else
			    {
				List<string> parts = Parse(component);
				all.AddRange(parts);
			    }
		    }
            }
	else
            {
                List<string> partOne = Parse(multiplier[0]);
                List<string> partTwo = Parse(multiplier[1]);
                
                foreach(string str1 in partOne)
		    {
			foreach(string str2 in partTwo)
			    {
				all.Add(str1+str2);
			    }
		    }
            }   
            
	return all;   
    }
        
    public static List<string> GetMultipliers(string exp)
    {
            
    }
}

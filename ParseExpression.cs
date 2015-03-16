//Write code that would parse an expression that is similar to BASH brace expansion. //Best illustrated with an example: the expression "(a,b,cy)n,m" would be parsed into //an array of the following strings: 
//an 
//bn 
//cyn 
//m 

//You can assume that the input will always be valid. 

//Hint: the expression can nest. Therefore, "((a,b)o(m,n)p,b)" parses into: 
//aomp 
//aonp 
//bomp 
//bonp 
//b

public class ExpressionParser
{
	public static void Main(string[] args)
	{	
	
	}
	
	public static List<string> Parse(string exp)
	{	
		if(string.IsNullOrWhiteSpace(exp))
		{
			return new List<string>();
		}
		
		
	}
}
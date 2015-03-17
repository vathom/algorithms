// ()()(), ()(()), (())(), ((()))
#include <iostream.h>
using namespace std;

int main()
{
  
}

void CreateBraces(int count)
{
  Vector<string> current = new Vector<string>();
  if (count == 0)
    {
      return current;
    }
  if(count == 1)
    {
      current.insert("()");
    }
  else
    {
      Vector<string> prev = CreateBraces(count-1);
      for(int i=0; i<prev.size; i++)
	{
	  for(int j=0; j<prev[i].length())
	    {
	      if(prev[i][j] == '(')
		{
		  string str = insertAfter(prev[i], j);
		  if(!current.Contains(str))
		    {
		      current.insert(str);
		    }
		}
	    }
	  if(!current.Contains("()" + prev[j]))
	    {
	      current.insert("()" + prev[j];
	    }
	}
    }
  return current;
}

string insertAfter(string str, int i)
{
  if(str == null || str == "")
    {
      return "()";
    }

  string first = str.substr(0, i+1);
  string rest = str.substr(i+1, str.length());
  return first + "()" + rest;
}

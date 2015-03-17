public class Kmp{
    public static void main(String[] args)
    {
	char[] s = {'a', 'b', 'e', 'd', 'a', 'b', 'c'};
	char[] w = {'a', 'b', 'c'};
  
	int k = kmpSearch(s, w);
	System.out.println(k);
    }

    public static int kmpSearch(char[] s, char[] w)
    {
	if(s == null && w == null)
	    {
		return -1;
	    }
	
	else if(s == null || w == null)
	    {
		return -1;
	    }
  
	int len = w.length;
	int[] table = new int[len];
	
	buildTable(w, table);
	
	int slen = s.length;
	int m = 0;
	int i = 0;
  
	while(m < slen)
	    {
		if(s[m+i] == w[i])
		    {
			if(i == len-1)
			    {
				return m;
			    }
			i=i+1;
		    }
		else
		    {
			if(table[i] > -1)
			    {
				m = m+i-table[i];
				i = table[i];
			    }
			else
			    {
				i = 0;
				m = m+1;
			    }
		    }
	    }
	
	return -1;
    } 
    
    public static void buildTable(char[] w, int[] t)
    {
	t[0] = -1;
	t[1] = 0;

	int nxt = 2;
	int cnt = 0;

	if(w[cnt] == w[nxt-1])
	    {
		cnt = cnt+1;
		t[nxt] = cnt;
		nxt = nxt+1;
	    }

	else if(cnt > 0)
	    {
		cnt = t[nxt];
	    }

	else
	    {
		t[nxt] = 0;
		nxt = nxt+1;
	    }
    }
}

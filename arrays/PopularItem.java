package arrays;

public class PopularItem
{
    public static void main(String[] args)
    {
	int[] arr = new int[] {1,2,2,3,3,4,4,5,6,7,8,9};
	int pop = getPopularItem(arr);
	System.out.println(pop);
    }
    
    //Given a sorted array of natural numbers, find the number which is popular.
    //Popular item is one thats present n/4 or more times in the array. n is # of items.
    //1,2,2,3,4,5,6,6,6,7
    public static int getPopularItem(int[] items){
        if(items == null){
	    return -1;
	}

	int n = items.length;
	
        if(n == 0){
	    return -1;
	}

	int popularity = n / 4;
	
	if(items[0] == items[popularity-1]){
	    return items[0];
	}

	if(items[n-1] == items[n-popularity]){
	    return items[n-1];
	}

	int l = 0;
	int i = popularity;
	int r = i-1;
	
	while(i <= 3*popularity){
	    int item = items[i];
	    int found = i;
	    while(l<=r){
		int mid  = (l+r)/2;
		if(items[mid] == item){
		    found = mid;
		    r = mid-1;
		}
		else{
		    l = mid+1;
		}
	    }

	    int next = found + popularity -1;
	    if(items[next] == item){
		return item;
	    }	    
	    l = i+1;
	    i = i+i;
	    r = i-1;
	   
	}
	return -1;
    }
}

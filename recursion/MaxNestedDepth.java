public class MaxNestedDepth{
    public static void main(String[] args){
	String str = "and(d(D)d)(ad(d(d))))";
	int max = getMaxDepth(str);
	System.out.println(max);
    }

    public static int getMaxDepth(String str){
	if(str == null){
	    return 0;
	}

	if(str == ""){
	    return 0;
	}

	char[] c = str.toCharArray();
	int count = 0;
	int max = count;

	for(int i=0; i<c.length; i++){
	    if(c[i] == '('){
		count++;
	    }
	    else if(c[i] == ')'){
		count--;
	    }
	    if(max < count){
		max = count;
	    }
	}
	if(count == 0){
	    return max;
	}
	else
	    return -1;
    }
}
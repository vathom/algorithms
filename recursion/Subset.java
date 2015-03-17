package recursion;

import java.util.ArrayList;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> output = getSubset("abc");
		for(String x:output){
			System.out.println(x);
		}
	}
	
	public static ArrayList<String> getSubset(String str){
		ArrayList<String> currentSubset = new ArrayList<String>();
		
		if(str == null || str.length() == 0){
			return currentSubset;
		}
		
		if(str.length() == 1){
			currentSubset.add("");
			currentSubset.add(str);
		}
		
		else{
			String currentStr = str.substring(0,1);
			String nextSubStr = str.substring(1);
					
			ArrayList<String> nextSubset = getSubset(nextSubStr);
			
			currentSubset.addAll(nextSubset);
			for(String x:nextSubset){
				String nextToAdd = currentStr + x;
				currentSubset.add(nextToAdd);
			}
		}
		return currentSubset;
	}
}

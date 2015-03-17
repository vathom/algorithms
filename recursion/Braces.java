package recursion;

import java.util.ArrayList;

public class Braces {
	public static void main(String[] args){
		printBraces(3);
	}
	
	/*
	 * Prints combinations of () for the given count
	 */
	public static void printBraces(int count){
		ArrayList<String> output = new ArrayList<String>();
		char[] chars = new char[count * 2];
		addBracesToList(count, count, 0, output, chars);
		
		for(String x:output){
			System.out.println(x);
		}
	}
	
	public static void addBracesToList(int open, int closed, int count, ArrayList<String> output, char[] chars){
		if(open < 0 || closed < open){
			return;
		}
		
		if(open == 0 && closed == 0){
			String s = String.copyValueOf(chars);
			output.add(s);
		}
		
		else{
			if(open > 0){
				chars[count] = '(';
				addBracesToList(open-1, closed, count+1, output, chars);
			}
			
			if(closed > open){
				chars[count] = ')';
				addBracesToList(open, closed-1, count+1, output, chars);
			}
		}
	}
}

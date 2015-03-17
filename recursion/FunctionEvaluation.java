package recursion;

public class FunctionEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "1^0|1|1";
		int c= eval(exp, true, 0, 6);
		System.out.println(c);
	}
	
	/*
	 * Given a function like f(1^0&1|1, true), return number of ways to parenthesize the expression
	 */
	public static int eval(String exp, boolean res, int start, int end){
		int c = 0;
		if(start == end){
			if(exp.charAt(start) == '1' && res){
				return 1;
			}
			else if(exp.charAt(start) == '0' && !res){
				return 1;
			}
			else{
				return 0;
			}
		}
		
		if(res){
			for(int i=start+1; i<=end; i+=2){
				if(exp.charAt(i) == '&'){
					c+= eval(exp, true, start, i-1) * eval(exp, true, i+1, end);
				}
				
				else if(exp.charAt(i) == '|'){
					c+= eval(exp, true, start, i-1) * eval(exp, false, i+1, end);
					c+= eval(exp, false, start, i-1) * eval(exp, true, i+1, end);
					c+= eval(exp, true, start, i-1) * eval(exp, true, i+1, end);
				}
				
				else if(exp.charAt(i) == '^'){
					c+= eval(exp, true, start, i-1) * eval(exp, false, i+1, end);
					c+= eval(exp, false, start, i-1) * eval(exp, true, i+1, end);
				}
			}
		}
		else{
			for(int i=start+1; i<=end; i+=2){
				if(exp.charAt(i) == '&'){
					c+= eval(exp, true, start, i-1) * eval(exp, false, i+1, end);
					c+= eval(exp, false, start, i-1) * eval(exp, true, i+1, end);
					c+= eval(exp, false, start, i-1) * eval(exp, false, i+1, end);
				}
				
				else if(exp.charAt(i) == '|'){
					c+= eval(exp, false, start, i-1) * eval(exp, false, i+1, end);
				}
				
				else if(exp.charAt(i) == '^'){
					c+= eval(exp, true, start, i-1) * eval(exp, true, i+1, end);
					c+= eval(exp, false, start, i-1) * eval(exp, false, i+1, end);
				}
			}
		}
		return c;
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

	public static void main(String[] args) {
		
		int n =4;
		ArrayList<String> list = new ArrayList<String>();
		list = generateParenthesis(list, "", n, n, n);
		
		System.out.println(list.size());
		for(String str: list) {
			
			System.out.println(str);	
			
		}
		
	}
	
	private static boolean isValid(String str) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		for(int i = 0; i< str.length();i++) {
			
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			if(str.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			return false;
		}
		
		return true;
	}

	public static ArrayList<String> generateParenthesis(ArrayList<String> list, String str, int ob, int cb, int n) {
	        
			if(ob == 0 && cb == 0) {
				if(str.charAt(0) == '(' && str.charAt(2*n-1) == ')' && isValid(str)) {
					list.add(str);
				}
				str = "";
			}
			if(ob > 0) {
				
				generateParenthesis(list, str+"(", ob-1, cb, n);
			}
			if(cb > 0) {
				generateParenthesis(list, str+")", ob, cb-1, n);
			}
		  return list;
	}
}

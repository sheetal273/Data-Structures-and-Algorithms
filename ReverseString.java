import java.util.Stack;

public class ReverseString {

	 public String solve(String A) {
		 String[] str = A.split("\\s+");
		 String temp = "";
		 Stack s = new Stack();
		
		 for(int i=0;i< str.length;i++) {
			 if(str[i].length() > 0) {
			String finalString = str[i].replaceAll("\\s", "");
			 s.push(finalString);
			 }
		 }
		 while(!s.isEmpty()) {
			 
			 temp=temp.concat((String) s.pop());
			 if(s.size() > 0) {
				 temp = temp.concat(" ");
			 }
		 }
		 System.out.println("size: "+ temp.length());
		 return temp;
	 }
	
	public static void main(String[] args) {
		String A="	sky	";
		ReverseString obj = new ReverseString();
	//	obj.solve(A);
		System.out.println(obj.solve(A));
	}
}

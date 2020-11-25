class Solution {
    public String decodeString(String s) {
		 Stack<Integer> numStack = new Stack<Integer>();
		 Stack charStack = new Stack();
		 
		 StringBuilder finalStr = new StringBuilder();
		 StringBuilder res = new StringBuilder();
		 
		 int val=0;
		 for(int i =0 ;i< s.length(); i++) {
			 
			
			 if(Character.isDigit(s.charAt(i))) {
				 
				 val = val *10 + Integer.parseInt(String.valueOf(s.charAt(i)));
	
			 }
			 else if(s.charAt(i) == '[') {
				 numStack.push(val);
				 val =0;
				 
				 charStack.push(res);
				 res = new StringBuilder();
			 }
			 
			 else if(s.charAt(i) == ']') {
				 
				 StringBuilder str = res;

				 res = new StringBuilder(charStack.pop().toString());
		 
				 int num = numStack.pop();
				 while(num-- > 0) {
					 res.append(str);
				 }
				 
				 
			 }
			 
			 else {
				 res.append(s.charAt(i));
			 }
	 
	 
	 }
		 
		 return res.toString();
    }
}

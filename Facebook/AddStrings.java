class Solution {
    public String addStrings(String num1, String num2) {
        		 
 int i = num1.length()-1;
		 int j = num2.length()-1;
		 
		 int carry = 0;
		 String result = "";
		 while(i >= 0 && j >= 0) {
			 
			 int sum = carry + (num1.charAt(i)- '0' + num2.charAt(j) -'0');
			 	 
			 if(sum >= 10) {
				 
				 carry = sum / 10;
			 }else{
				 
				 carry = 0;
			 }
			 
			 result = result + sum%10;
			 
			 i--;
			 j--;	
		 }
		 
		 
		 while(i >= 0) {
			 int sum = carry + (num1.charAt(i) - '0');
			 result = result + sum %10;
			 carry = sum /10;
			 
			 i --;
		 }
		 
		 while(j >= 0) {
			 System.out.println(" in j loop " + j  + " result "+ result);
			
			 int sum = (carry + (num2.charAt(j) - '0'));
			 carry = sum /10;
			 
			 result = result + sum%10;
			 j --;
		 }
		 if(carry != 0) {
			 result = result + carry;
		 }
		
		 StringBuilder str = new StringBuilder(result);
		 return str.reverse().toString();
    }
    
    
}

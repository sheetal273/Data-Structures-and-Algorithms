class Solution {
	
	    public String addBinaryOptimal(String a, String b) {
		
		int i = a.length() -1;
		int j = b.length() -1;
		int carry =0;
		
		StringBuilder result = new StringBuilder();
		
		while(i>=0 || j >= 0) {
			
			int sum = carry;
			
			if(i >=0 ) {
				sum += a.charAt(i--) - '0';
			}
			if(j >= 0) {
				sum += b.charAt(j--) - '0';
			}
			result.insert(0, sum%2);
			carry = sum / 2;
			
		}
		
		if(carry > 0) {
			result.insert(0,1);
		}
		
		return result.toString();
    }
	
    public String addBinary(String a, String b) {
int i = a.length()-1;
		int j = b.length() -1;
		int carry = 0;
		StringBuilder sum = new StringBuilder();
		
		while(i >= 0 && j >= 0) {
			int total = Integer.valueOf(String.valueOf(a.charAt(i))) + Integer.valueOf(String.valueOf(b.charAt(j)));
			
			if(total > 1) {
				if(carry == 0) {
					sum.append(0);
					
				} else if(carry == 1){
					sum.append(1);
					
				}
				carry = 1;
				
			}
			else {
				if(total == 1) {
					
					if(carry == 1) {
						sum.append(0);
						carry = 1;
					}else {
						sum.append(total);
						carry =0;
					}
					
				}else {
					sum.append(0+carry);
					carry =0;
				}
			}
			
			i--;
			j--;
		}
		
		
		while(i >= 0) {
			
			if(carry == 1 && a.charAt(i) == '1') {

				sum.append(0);
				carry = 1;
			}else {
				int s = carry + Integer.valueOf(String.valueOf(a.charAt(i))); 
				sum.append(s);
				carry = 0;
			}
			i--;
		}
	
		while(j >= 0) {
			if(carry == 1 && b.charAt(j) == '1') {
			
				sum.append(0);
				carry = 1;
			}else {
				int s = carry + Integer.valueOf(String.valueOf(b.charAt(j))); 
				sum.append(s);
				carry =0;
				
			}
			j--;
		}
		
		if(carry != 0) {
			sum.append(carry);
		}
		
		
	
		return sum.reverse().toString();
    }
}

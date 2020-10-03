
public class KPalindrome {

	public static void main(String[] args) {
		
		String str = "pqwuzifwovyddwyvvbu";
		int k = 16;
			
		System.out.println(isPalindrome(str, k));
		
		 
		 
	}

	private static boolean isPalindrome(String str, int k) {
		// TODO Auto-generated method stub
		
		if(str.length() <= 1) {
			return true;
		}
	
		if(checkPalindrome(str)) {
			return true;
		}

		if(k == 0) {
			return false;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
		
			return isPalindrome(str.substring(1, str.length()-1), k);
		}
		else {
			return isPalindrome(str.substring(0, str.length()-1), k-1)
					|| isPalindrome(str.substring(1, str.length()), k-1) ;
		}
		
	}
	
    
	private static boolean checkPalindrome(String str) {
		
		int i = 0;
		while(i<= str.length()/2) {
		
			if(str.charAt(i) !=  str.charAt(str.length()-i-1)) {
				return false;
			}
			i++;
		}
		return true;
	}
}

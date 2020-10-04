
public class KPalindromeUsingDP {

	public static void main(String args[]) {
		
		String str = "abcdecba";
		int k = 1;
		
		System.out.println(isPalindrome(str, reverse(str), k));
	}
	
	 
	  
	  private static boolean isPalindrome(String str, String reverse, int k) {
		// TODO Auto-generated method stub
		
		  int[][] dp = new int[str.length()+1][str.length()+1];
		  
		  for(int i=0;i<=str.length();i++) {
			  
			  for(int j=0;j<= str.length();j++) {
				  
				  if(i==0) {
					  dp[i][j] = j;
				  }
				  
				  else if(j==0) {
					  dp[i][j] = i;
				  }
				  
				  else if(str.charAt(i-1) == reverse.charAt(j-1)) {
					  dp[i][j] = dp[i-1][j-1];
				  }
				  else{
					  dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
				  }
			  }
		  }
		return dp[str.length()][str.length()] <= k*2;  
	}



	static String reverse(String str) 
	    { 
	        StringBuilder sb = new StringBuilder(str); 
	        sb.reverse(); 
	        return sb.toString(); 
	    } 
}

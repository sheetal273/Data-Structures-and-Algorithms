
public class SpecialKeyboard {

	public static void main(String[] args) {
		
		System.out.println(optimalKeys(7));
    
	}
	
	  static int optimalKeys(int n){
	        // code here
	        
		int[] dp = new int[n];
			for(int i=0;i< n;i++) {
				
				dp[i] = -1;
				
			}
			
			return optimalKeysdp(n, dp);
	    }
	    
	    	
		private static int optimalKeysdp(int n, int[] dp) {
			// TODO Auto-generated method stub
			
		
			if(n <= 6) {
				return n;
			}
			
			int max_so_far = 0;
			for(int b = n-3;b>=1;b--) {
				
				if(dp[b] == -1) {
					dp[b] = optimalKeysdp(b, dp);
				}
				
				
				int curr = (n-b-1)* dp[b];
				if(curr > max_so_far) {
					max_so_far = curr;
				}
				
			}
			return max_so_far;
		}
		
}

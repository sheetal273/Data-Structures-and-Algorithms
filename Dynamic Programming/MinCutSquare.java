
public class MinCutSquare {

	public static void main(String[] args) {
		
		int M = 30;
		int N = 35;
		
		System.out.println(findMinimumCuts(M, N));	
		
		System.out.println(findMinimumCutsDP(M, N));
		
		
	}
	
	
	

	private static int findMinimumCutsDP(int M, int N) {
		// TODO Auto-generated method stub
		
		int[][] dp = new int[M+1][N+1];
		
		for(int i=1;i<= M;i++) {
			for(int j=1;j<= N;j++) {

				if(i == j) {
					dp[i][j] = 0;
				}
				else {
					
					int ans = Integer.MAX_VALUE;
					for(int k=1;k< j;k++) {
						
						ans = Math.min(ans, 1+ dp[i][j-k] + dp[i][k]);
					}
					
					for(int k=1;k< i;k++) {
						
						ans = Math.min(ans, 1+ dp[i-k][j] + dp[k][j]);
					}
					dp[i][j] = ans;
				}
				
				
			}
		}
		
		return dp[M][N]+1;
	}




	private static int findMinimumCuts(int m, int n) {
		// TODO Auto-generated method stub
		
		
		if(m< n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		System.out.println("After swap : "+ m  + " n  = "+ n);
		int result = 0; 
		int rem = 0;
		while(n > 0) {
			
			result = result + m/n;
			rem = m%n;
			m = n;
			n = rem;
		}
		
		return result;
	}
}

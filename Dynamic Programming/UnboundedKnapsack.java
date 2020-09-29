import java.util.Scanner;

public class KnabsackWithDuplicates {

	
	public static void main(String args[]) {
		
		int val[] = {1, 4, 5, 7};
		int wt[] = {1, 3, 4,5};
		int W = 8;
		
		int[][] dp = new int[val.length+1][W+1];
		
		System.out.println(findCombinations(val, wt, W, val.length, dp));
	}

	private static int findCombinations(int[] val, int[] wt, int W, int n, int[][] dp) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<= val.length;i++) {
			
			for(int w =0;w<= W;w++) {
				
				if(i ==0 || w == 0) {
					dp[i][w] = 0;
				}
				else if(wt[i-1] <= w) {
					
					dp[i][w] = Math.max(val[i-1] + dp[i][w-wt[i-1]], dp[i-1][w]);
					
				}
				else {
					dp[i][w] = dp[i-1][w];
				}	
			}
		}
		
		return dp[n][W];
		
	}	
}

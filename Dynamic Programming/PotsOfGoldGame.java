
public class PotsOfGoldGame {

	public static void main(String[] args) {
		
		int A[] = {8,15,3, 7};
		int N = 4;
		
		System.out.println(maxCoins(A, N));
	}
	
	public static int maxCoins(int A[],int n)
	{
		if(n == 1) {
			return A[0];
		}
		
		if(n == 2) {
			return Math.max(A[0], A[1]);
		}
		int[][] dp = new int[n][n];
		
		for(int i=0;i< n;i++) {
			for(int j =0;j< n;j++) {
				dp[i][j] = -1;
			}
		}
		return maxCoinsRec(A, 0, A.length-1, dp);
    }

	private static int maxCoinsRec(int[] coins, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		if(i == j) {
			return coins[i];
		}
		
		if(i+1 == j) {
			return Math.max(coins[i], coins[j]);
		}
		
		if(i >= 0 && i < coins.length && j >= 0 && j < coins.length) {
			
			int opt1 = coins[i] + Math.min(maxCoinsRec(coins, i+2, j, dp), maxCoinsRec(coins, i+1, j-1, dp));
			
			int opt2 = coins[j]+ Math.min(maxCoinsRec(coins, i, j-2, dp), maxCoinsRec(coins, i+1, j-1, dp));
			
			dp[i][j] = Math.max(opt1, opt2);
			return dp[i][j];
		}
		return 0;
	}
	
}

import java.util.Scanner;

public class KnapsackWithDP {

	
	public static void main(String args[]) {
		
	/*	int val[] = {1, 2,3 };
		int wt[] = {4,5,1};
		int W = 4;
		
		int[][] dp = new int[val.length+1][W+1];
		

		
		System.out.println(findCombinations(val, wt, W, val.length, dp));
		*/
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			int N = scanner.nextInt();
			int W = scanner.nextInt();
			
			int val[] = new int[N];
			int wt[] = new int[N];

			for(int i=0;i< N;i++) {
				val[i] = scanner.nextInt();
			}
			
			for(int i=0;i< N;i++) {
				wt[i] = scanner.nextInt();
			}
			int[][] dp = new int[val.length+1][W+1];
			
			System.out.println(findCombinations(val, wt, W, val.length, dp));
			T--;
		}
		
	}

	private static int findCombinations(int[] val, int[] wt, int W, int n, int[][] dp) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<= val.length;i++) {
			
			for(int j =0;j<= W;j++) {
				
				if(i ==0 || j == 0) {
					dp[i][j] = 0;
				}
				else if(wt[i-1] <= j) {
					dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
				
			
			}
		}
		
		return dp[n][W];
		
	}
	
	
	
	
	
}

import java.util.Scanner;

public class KnabsackWithDuplicates {

	
	public static void main(String args[]) {
		
		int val[] = {1, 2,3 };
		int wt[] = {4,5,1};
		int W = 4;
		
		System.out.println(findCombinations(val, wt, W, val.length));
    
	}

	private static int findCombinations(int[] val, int[] wt, int W, int n) {
		// TODO Auto-generated method stub
		
		if(W == 0 || n == 0) {
			return 0;
		}
		if(wt[n-1] > W) {
			return findCombinations(val, wt, W, n-1);
		}
		
		return Math.max(val[n-1] + findCombinations(val, wt, W-wt[n-1], n-1), findCombinations(val, wt, W, n-1));
		
	}
}

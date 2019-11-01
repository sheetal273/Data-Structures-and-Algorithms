
public class GridUniquePathsOptimal {

	 public int uniquePaths(int A, int B) {
	 
		 int[][] grid = new int[A][B];
		 for(int i=0;i< A;i++) {
			grid[i][0] =1;
		 }
		 
		 for(int j=0;j< B;j++) {
			 grid[0][j]=1;
				 
		}
		 
		 for(int i=1;i< A;i++) {
			 for(int j=1;j< B;j++) {
				 
				 grid[i][j] = grid[i-1][j] + grid[i][j-1];
			 }
		 }
		 return grid[A-1][B-1];
	 }
	
	 private int paths(int[][] grid, int i, int j, int A, int B, int up) {
		
		 if(A == 0 && B == 0) {
			 return 0;
		 }
		 if(i == A-1 || j == B-1) {
			 up = up+1;
			return up;
		 }
		 return (paths(grid, i, j+1, A, B, up) + paths(grid, i+1, j, A, B, up)); 
	 }
	 
	public static void main(String[] args) {
		
		int A =2; int B = 2;
		GridUniquePathsOptimal obj = new GridUniquePathsOptimal();
		System.out.println(obj.uniquePaths(A, B));
	}
}

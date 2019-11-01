
public class GridUniquePaths {

	 public int uniquePaths(int A, int B) {
	 
		 int[][] grid = new int[A][B];
		 for(int i=0;i< A;i++) {
			 for(int j=0;j< B;j++) {
				 
				grid[i][j]=0;
				 
			 }
		 }
		 
		 
		 return paths(grid, 0,0, A, B, 0);
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
	 
	 private int max(int x, int y) {
		 if(x > y) {
			 return x;
		 }
		 return y;
	 }
	 
	public static void main(String[] args) {
		
		int A =2; int B = 2;
		GridUniquePaths obj = new GridUniquePaths();
		System.out.println(obj.uniquePaths(A, B));
	}
}

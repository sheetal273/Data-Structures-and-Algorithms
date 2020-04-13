
public class CountNegatives {

	 public int countNegative(int[][] grid) {
	        
		 int count = 0;
		 for(int i=0;i< grid.length;i++) {
			 for(int j=0;j< grid[i].length;j++) {
				 
				 if(grid[i][j] < 0) {
					 count = count + (grid[i].length - j);
					 break;
				 }
			 }
		 }
		 
		 return count;
	 }
	 
	 public static void main(String[] args) {
		 
		 int[][] grid = {
				 {4,3,2,-1},
				 {3,2,1,-1},
				 {1,1,-1,-2},
				 {-1,-1,-2,-3}
		 };
		 CountNegatives obj = new CountNegatives();
		 System.out.println(obj.countNegative(grid));
	 }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     
       int col = matrix[0].length-1;
	   int row = 0; 
	
	while(row < matrix.length && col >= 0) {
		
		if(matrix[row][col] == target) {
			return true;
		}
		else if(matrix[row][col] < target) {
			row ++;
		}
		else {
			col--;
		}
	}
	

	  // write your code here
	  return false;
	  
    }
}

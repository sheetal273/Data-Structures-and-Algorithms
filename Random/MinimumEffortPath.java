class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        		if(heights.length > 0) {
		
			
			int start =0; 
			int end = Integer.MAX_VALUE;
			
			int ans = Integer.MAX_VALUE;
			
			int m = heights.length;
			int n = heights[0].length;
			
			while(start <= end) {
				int mid = start + (end -start) /2;
				int[][] visited = new int[heights.length][heights[0].length];
				
				if(minimumEffortPath1(0, 0, mid, m, n, heights, visited)) {
					ans = Math.min(ans, mid);
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			return ans;
			
		}
        return 0;
    }
    
    private static boolean minimumEffortPath1(int i, int j, int mid, int m, int n, int[][] heights, int[][] visited) {
		// TODO Auto-generated method stub
	
		if(i == m -1 && j ==n-1) {
			return true;
		}
		visited[i][j] = 1;
		boolean op = false;
		if(i > 0 && visited[i-1][j] ==0 && Math.abs(heights[i][j] - heights[i-1][j]) <= mid) {
			op = op || minimumEffortPath1(i-1, j, mid, m, n, heights, visited);
		}
		if(j > 0 && visited[i][j-1] ==0 && Math.abs(heights[i][j] - heights[i][j-1]) <= mid) {
			op = op || minimumEffortPath1(i, j-1, mid, m, n, heights, visited);
		}
		if(i < m-1 && visited[i+1][j] ==0 && Math.abs(heights[i][j] - heights[i+1][j]) <= mid) {
			op = op || minimumEffortPath1(i+1, j, mid, m, n, heights, visited);
		}
		if(j < n-1 && visited[i][j+1] ==0 && Math.abs(heights[i][j] - heights[i][j+1]) <= mid) {
			op = op || minimumEffortPath1(i, j+1, mid, m, n, heights, visited);
		}
		
		
		return op;
	}



}

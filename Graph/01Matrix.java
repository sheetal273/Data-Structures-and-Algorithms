class Solution {
    
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
		 
		 Queue<int[]> q = new LinkedList<>();
		 boolean[][] visited = new boolean[m][n];
		 
		 for(int i=0;i< matrix.length;i++) {
				
				for(int j=0;j< matrix[i].length;j++) {
					
					if(matrix[i][j] == 0) {
						
						q.offer(new int[] {i,j});
						visited[i][j] = true;
					}
				}
				
			}
		 
		 	final int[][] dirs = {{0,1},{0, -1}, {1, 0}, {-1, 0}};
		 	
		 	while(!q.isEmpty()) {
		 		
		 		int size = q.size();
		 		
		 		for(int i=0;i< size;i++) {
					
					int[] curr = q.poll();
					int currX = curr[0];
					int currY = curr[1];
					
					for(int[] dir: dirs) {
						
						int x = currX + dir[0];
						int y = currY + dir[1];
						
						if(x< 0 || x>m-1 || y<0 || y> n-1 || visited[x][y]) {
							continue;
						}
						matrix[x][y] = matrix[currX][currY] + 1;
						q.offer(new int[] {x, y});
						visited[x][y] = true;
					}
					
				}
		 	}
		 
		 return matrix;
	}
}

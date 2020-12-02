class Solution {
    
    private static void dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i < 0|| i >= grid.length || j <0 || j >= grid[i].length || grid[i][j] != '1') {
			return;
		}
		
		grid[i][j] = '2';
		
		dfs(grid, i+1, j);
		dfs(grid, i-1, j);
		dfs(grid, i, j+1);
		dfs(grid, i, j-1);	
	}
    
    public int numIslands(char[][] grid) {
        int total_islands = 0;
			for(int i =0;i< grid.length;i++) {
				for(int j=0;j< grid[i].length;j++) {
					
					if(grid[i][j] == '1') {
						dfs(grid, i, j);
						total_islands ++;
					}
				}
			}
        return total_islands;
    }
}

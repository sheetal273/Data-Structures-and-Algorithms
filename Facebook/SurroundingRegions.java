class Solution {
    public void solve(char[][] board) {
        
        if(board.length > 0) {
			 
			int[][] visited = new int[board.length][board[0].length];
				
			for(int i=0;i< board.length;i++) {
				for(int j=0;j< board[i].length;j++) {
					
					if((i==0 || j==0 || i== board.length -1|| j == board[i].length-1 )&& visited[i][j] == 0) {
	
						solve(board, i, j, visited);
					}
				}
			}
			
			for(int i=0;i< board.length;i++) {
				for(int j=0;j< board[i].length;j++) {
					
					if(visited[i][j] == 0 && board[i][j]== 'O') {
						board[i][j] = 'X';
						
					}
				}
			}
        }
    }
    
    
    public static void solve(char[][] board, int i, int j, int[][] visited) {
        
		if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j] == 1 || board[i][j] == 'X') {
			return;
		}
		
		
		visited[i][j] = 1;
		solve(board, i+1,j, visited);
		solve(board, i-1,j,visited);
		
		solve(board, i,j+1,visited);
		solve(board, i,j-1,visited);
		
    }
}

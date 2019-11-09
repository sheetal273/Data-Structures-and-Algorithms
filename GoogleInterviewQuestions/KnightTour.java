/**
 * 
 */
package GoogleInterviewQuestions;

/**
 * @author Sheetal Chhabra
 *
 */
public class KnightTour {

	public static int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
    public static int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 


	private static boolean solveKTUtil(int row, int col, int[][] sol, int moves) {
		// TODO Auto-generated method stub
		
		if(moves == 64) {
			
			  for (int i = 0; i < 8; i++)
	            {
	                for (int j = 0; j < 8; j++)
	                {
	                	System.out.print( " "+ sol[i][j]); 
	                }
	                System.out.println("");
	            }
	            return true;
		}
		else {
			for(int k=0;k< xMove.length;k++) {
				
				int next_x = row + xMove[k];
				int next_y = col + yMove[k];
				
				if(isSafe(next_x, next_y, sol)) {
					
					 moves++;
					sol[next_x][next_y] = moves;
					
					if(solveKTUtil(next_x, next_y, sol, moves)) {
						return true;
					}else {
						moves--;
						sol[next_x][next_y] = 0;
					}
				}
			}
		}
		return false;
	}
    
    public static boolean isSafe(int x, int y, int[][] sol) {
    	if(x>=0 && x < 8 && y >=0 && y <8 && sol[x][y] == 0) {
    		return true;
    	}
		return false;
	}
	
	public static void main(String args[]) {
		
		 int[][] visited =   {{0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 },
                 {0,0,0,0,0,0,0,0 }};
		visited[0][0] = 1;
		solveKTUtil(0, 0, visited, 1);
	}
}

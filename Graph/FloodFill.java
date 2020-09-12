import java.util.Scanner;

public class FloodFill {

	public static void main(String args[]) {
		
		//code
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			
			int[][] graph = new int[M][N];
			
			for(int i=0;i<M;i++) {
				
				for(int j=0;j<N;j++) {
					
					graph[i][j] = scanner.nextInt();
				}
			}
			
			int pt1 = scanner.nextInt();
			int pt2 = scanner.nextInt();
			
			int k = scanner.nextInt();
			
			
			int[][] visited = new int[M][N];
			
			int color = graph[pt1][pt2];
			
			
			FloodFillMatrix(graph, visited, M, N, pt1, pt2, k, color, pt2);
			
			for(int i=0;i<M;i++) {
				
				for(int j=0;j<N;j++) {
					
					System.out.print(" "+ graph[i][j]);
				}
			}
			T--;
		}
	}

	private static void FloodFillMatrix(int[][] graph, int[][] visited, int m, int n, int pt1, int pt2, int k, int color,
			int j) {

		if(pt1 < 0 || pt1 >= m || pt2 < 0 || pt2 >= n) {
			
			return;
		}
		
		if(graph[pt1][pt2] != color) {
			return;
		}
		
	
			graph[pt1][pt2] = k;
			
			FloodFillMatrix(graph, visited, m, n, pt1-1, pt2, k, color, j);
			FloodFillMatrix(graph, visited, m, n, pt1, pt2-1, k, color, j);
			FloodFillMatrix(graph, visited, m, n, pt1, pt2+1, k, color, j);
			FloodFillMatrix(graph, visited, m, n, pt1+1, pt2, k, color, j);
			
		
	}



}

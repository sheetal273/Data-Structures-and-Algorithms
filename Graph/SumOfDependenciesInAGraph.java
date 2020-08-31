import java.util.Scanner;
import java.util.Vector;

public class SumOfDependenciesInAGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
		
		int N = scanner.nextInt();
		
		int E = scanner.nextInt();
		/*
		Vector<Integer> adj[] = new Vector[N]; 
        
        for (int i = 0; i < adj.length; i++) { 
            adj[i] = new Vector<>(); 
        } 
		
        int i = E;
		while(i > 0) {
			
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			
			 addEdge(adj, u, v); 
			 
			i = i -1;
		}
        
		System.out.println(findSum(adj, N));
		
		*/
		
		int[][] graph = new int[N][N];
		
		int i = E;
		while(i > 0) {
			
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			
			graph[u][v] ++;
			i = i -1;
		}
	
		
		System.out.println("Current Graph : ");
		int count = 0;
		for( int m = 0; m< N;m ++) {
			int row = 0;
			for(int n =0;n < N;n++) {
				
			//	if(graph[m][n] == 1) {
					row++;
					count = count + graph[m][n];
				// }
				

			}
			System.out.println("\n  " + row);
		}
		System.out.println("final \n" + count);
	
		
		
		T--;
		}
	}

	  // To add an edge 
    static void addEdge(Vector <Integer> adj[], int u,int v) 
    { 
        adj[u].addElement((v)); 
    } 
      
    // find the sum of all dependencies 
    static int findSum(Vector<Integer> adj[], int V) 
    { 
        int sum = 0; 
       
        // just find the size at each vector's index 
        for (int u = 0; u < V; u++) 
        {
        	System.out.print(" " + adj[u]);
            sum += adj[u].size(); 
        }
       
        return sum; 
    } 
}

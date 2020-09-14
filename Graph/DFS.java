import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			int N = scanner.nextInt();
			int E = scanner.nextInt();
			
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(N);
			
			for(int i=0;i< N;i++) {
				graph.add(new ArrayList<Integer>());
			}
			
			
			for(int i =0;i < E;i++) {
				
				int v1 = scanner.nextInt();
				int v2 = scanner.nextInt();
				
				graph.get(v1).add(v2);
				
			}
			
			dfs(graph, N);
			
			T--;
		}
		
	}

	
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
    	ArrayList<Integer> flist = new ArrayList<Integer>();
    	
    	boolean[] visited = new boolean[N];
    	
    	dfsUtil(0, g, flist, visited, N);
    	
    	for (int i : flist) {
		
    		System.out.print("  "+ i);
		}
    	
		return flist;
       // add your code here
    }
    
    private static void dfsUtil(int i, ArrayList<ArrayList<Integer>> g, ArrayList<Integer> flist, boolean[] visited,
			int n) {
		// TODO Auto-generated method stub
    	
    	if(i<n && i >=0) {
    		
    	
    	visited[i] = true;
    	flist.add(i);
    	
    	for(int node : g.get(i) ) {
    		
    		if(visited[node] == false) {
    			dfsUtil(node, g, flist, visited, n);
    		}
    	}
    	}
		
	}

    
}

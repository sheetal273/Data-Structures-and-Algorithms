import java.util.ArrayList;
import java.util.Scanner;

public class CountAllPaths {

	static int countPaths=0;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			countPaths=0;
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
			
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			
			dfs(graph, N, start, end);
			
			T--;
		}
		
	}

	
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N, int start, int end)
    {
    	ArrayList<Integer> flist = new ArrayList<Integer>();
    	
    	boolean[] visited = new boolean[N];
    	
    
    		dfsUtil(start, g, flist, visited, N, end);
    	  
    		System.out.println(countPaths);
    		
    		return flist;
    }
    
    private static void dfsUtil(int i, ArrayList<ArrayList<Integer>> g, ArrayList<Integer> flist, boolean[] visited,
			int n, int end) {
		// TODO Auto-generated method stub
    	
    	if(i<n && i >=0) {
    	
    		if(i == end) {
    			countPaths++;
    			
    			flist.add(end);
        		
    			System.out.print("Path =>");
        		for (int j : flist) {
        			
        			//Print path here
        			 System.out.print("  "+ j);
        		}
        		flist.clear();
        		return;
    		}
    	
    	
    	visited[i] = true;
    	
    	for(int node : g.get(i) ) {
    		
    		if(visited[node] == false) {
    		  	flist.add(i);
    			dfsUtil(node, g, flist, visited, n, end);
    		}
    	}
    	}
		
    	visited[i] = false;
    	  
	}

    
}

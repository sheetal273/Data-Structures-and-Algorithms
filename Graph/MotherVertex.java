import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MotherVertex {

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
			
			System.out.println(dfs(graph, N));
			
			T--;
		}
		
	}

	private static int dfs(ArrayList<ArrayList<Integer>> graph, int n) {
		// TODO Auto-generated method stub
		
		int mother = 0;
		boolean[] visited = new boolean[n];
		for(int j =0;j< n;j++) {
			if(visited[j] == false) {
				dfsUtil(j, graph, visited, n);
				mother = j;
			}		
		}
		
		boolean[] trust = new boolean[n];
		dfsUtil(mother, graph, trust, n);
		
		for(int i=0;i< n;i++) {
			if(trust[i] == false) {
				return -1;
			}
		}
		return mother;
	}

	private static void dfsUtil(int i, ArrayList<ArrayList<Integer>> graph, boolean[] visited, int n) {
		// TODO Auto-generated method stub
		
		visited[i] = true;
		
		ArrayList<Integer> list = graph.get(i);
		
		for(int x : list) {
			
			if(!visited[x]) {
				dfsUtil(x, graph, visited, n);
			}
		}
		
	}

	
	
	
	
}

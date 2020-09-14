import java.util.*;

public class BFS {

	public static void main(String args[]) {
		
		
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
				graph.get(v2).add(v1);
			}
			
			
			bfs(graph, N);
			
			
			T--;
		}
	}

	private static void bfs(ArrayList<ArrayList<Integer>> graph, int n) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>(); 
		boolean[] visited = new boolean[n];
		
		ArrayList<Integer> flist = new ArrayList<Integer>();
		
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			
			int el = queue.poll();
			flist.add(el);
			
			ArrayList<Integer> list = graph.get(el);
			for (int x : list) {
			
				if(!visited[x]) {

					visited[x] = true;
					queue.add(x);
				}
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

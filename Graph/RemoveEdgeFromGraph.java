package Graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveEdgeFromGraph {

	public static boolean isValidPath = false;
	static class Graph {
		int V;
		LinkedList<Integer> adjArray[];
		
		Graph(int v){
			this.V = v;
			adjArray = new LinkedList[V];
			
			for(int i=0;i<V;i++) {
				adjArray[i] = new LinkedList<>();
			}
		}
	
	static void addEdge(Graph graph, int src, int dest) {
		
		graph.adjArray[src].add(dest);
	//	graph.adjArray[dest].add(src);
		
	}
	
	static void removeEdge(Graph graph, int src, int dest) {
		graph.adjArray[src].remove(dest);
		graph.adjArray[dest].remove(src);
	}
	
	void DFS(Graph graph, int v) {
		
		boolean[] visited = new boolean[graph.V];
		
		DFSUtil(graph, visited, v);
	}
	
	public void DFSUtil(Graph graph, boolean[] visited, int v) {
		
		visited[v] = true;
		System.out.print(" -> "+ v);
		ListIterator<Integer> iterator = graph.adjArray[v].listIterator();
		
		while(iterator.hasNext()) {
			
			int node = iterator.next();
			if(visited[node] == false) {
				DFSUtil(graph, visited, node);
			}
		}
		
	}
	
	void BFS(Graph graph, int s) {
		
		boolean[] visited = new boolean[graph.V];
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		visited[s] = true;
		list.add(s);
		
		while(list.size()!=0) {
				
			int node = list.poll();
			

			System.out.print(" "+ node + " ->");
			ListIterator<Integer> iterator = graph.adjArray[node].listIterator();
			
			while(iterator.hasNext()) {
				
				Integer data = iterator.next();
				if(!visited[data]) {

					list.add(data);
					visited[data] = true;
				}
			}
			
		}
		
		
	}
	

	boolean validPath(Graph graph, int src, int dest) {
		
		boolean[] visited = new boolean[graph.V];
	//	validPathUtil(graph, visited, src, dest);
		validPathUtil(graph, visited, src, dest);
	
		return isValidPath;
	}
	
	void validPathUtil(Graph graph, boolean[] visited, int src, int dest) {
		
		visited[src] = true;
		if(src == dest) {
			isValidPath = true;
			System.out.println(" found path!" + " Printing src  :"+ src + "dest : "+ dest);
		//	return found;
		}
		ListIterator<Integer> iterator= graph.adjArray[src].listIterator();
		while(iterator.hasNext()) {	
			
			int node = iterator.next();
			if(!visited[node]) {
				validPathUtil(graph, visited, node, dest);
				
			}
		}
		//return found;
	}
	
	static void printGraph(Graph graph) {
		
		for(int i=0; i<graph.V;i++ ) {
			
			System.out.println("List for vertex : "+ i);
			for(Integer element : graph.adjArray[i]) {
				System.out.print(" "  + element + " ->");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String args[]) {
		
		int V = 4;
		Graph graph = new Graph(V);

		  addEdge(graph, 0, 1); 
	      addEdge(graph,0, 2); 
	      addEdge(graph,1, 2); 
	      addEdge(graph,2, 0); 
	      addEdge(graph,2, 3); 
	      addEdge(graph,3, 3); 
		
//		printGraph(graph);
		
		//removeEdge(graph,1, 3);
		System.out.println("After removing the graph !!");
	//	printGraph(graph);
		
		System.out.println("Depth first of a graph: ");
		
	//	graph.DFS(graph, 2);
		
		System.out.println("\n Breadth First Search of a graph: ");
		graph.BFS(graph, 1);
		//printGraph(graph);
		

		System.out.println("\n check path validity of a graph: ");
		System.out.println( "valid path : "+ graph.validPath(graph, 3, 1));
		
		System.out.println("\n check path validity of a graph: ");
	//	graph.validPath(graph, 3, 1);
	}
}
}

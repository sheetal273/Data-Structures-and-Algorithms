package Graph;

import java.util.LinkedList;

public class GraphOperations {

	static class Graph{
		int V;
		LinkedList<Integer>  adjList[];
	
		Graph(int V){
			
			this.V = V;
			adjList = new LinkedList[V];
			
			for(int i = 0; i < V; i++) {
				adjList[i] = new LinkedList<>();
			}
			
		}
	}
	
	static void addEdge(Graph graph, int src, int dest) {
		
		graph.adjList[src].add(dest);
		
		graph.adjList[dest].add(src);
		
	}
	
	static void printGraph(Graph graph) {
		
		for(int i=0; i< graph.V; i++) {
			
			System.out.println("Adjancy list for the vertex : "+ i);
			for ( Integer pcrawl : graph.adjList[i]) {
				System.out.print(" - > " +pcrawl);
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]) {
	
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 1, 2);
		printGraph(graph);
	}
}

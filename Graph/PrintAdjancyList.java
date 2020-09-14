import java.util.ArrayList;
import java.util.Scanner;

public class PrintAdjancyList {


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
		
		for(int i=0;i<N;i++) {
			
			ArrayList<Integer> list = graph.get(i);
			System.out.print(i);
			for (int x: list) {
				System.out.print("-> ");
				System.out.print(x);
			}
			System.out.println("");
		}
		
		T--;
	}
	
		
	}
}

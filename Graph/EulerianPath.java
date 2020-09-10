import java.util.Scanner;
import java.util.Stack;

public class EulerianPath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			
			int N = scanner.nextInt();
			int[][] graph = new int[N][N];
			
			for(int i =0; i< N; i++) {
				
				for(int j=0;j< N;j++) {
					
					graph[i][j] = scanner.nextInt();
				}
			}
			
			int odd = 0;
			for(int i =0; i< N; i++) {
				
				int count =0;
				for(int j=0;j< N;j++) {
					
					if(graph[i][j] == 1){
						count ++;
					}
				}
				if(count % 2 == 1) {
					odd++;
				}
			}
			if(odd == 2) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
			
			T--;
		}
	}
	
}

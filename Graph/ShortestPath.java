import java.util.Scanner;
import java.util.Stack;

public class ShortestPath {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
			
			int N = scanner.nextInt();
			
			int count =0;
			while(N > 1) {
				
				if(N%3 == 0) {
					N = N/3;
					count ++;
				}
				else {
					N = N-1;
					count++;
				}
				
			}
			System.out.println(count);

			T--;
		}
		
	}
}

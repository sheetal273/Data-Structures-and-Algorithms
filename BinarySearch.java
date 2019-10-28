import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = scanner.nextInt();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
		
		
		System.out.println("Search element : " );
		int element = scanner.nextInt();
		
		int mid, l, r;

		mid = arr.size()/2; //7
		l = 0;
		r = arr.size() - 1;
		
		while(l <= r) {
			
			
			if(arr.get(mid) == element) {
				System.out.println("Found element at : " + mid);
				break;
			}
			
			if(element > arr.get(mid)) {
				l = mid + 1;
			}
			else {
				r = mid - 1;
			}
			mid = (l+r)/2;
		}
		
		if(l > r) {
			System.out.println("Element Not Found !");
		}
		
		
	}
}

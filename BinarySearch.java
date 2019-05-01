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
		
		int mid, l, r;

		mid = arr.size()/2;
		l = 0;
		r = arr.size() - 1;
		int el;
		System.out.println("Search element : " );
		el = scanner.nextInt();
		
		while(l <= r) {
			
			System.out.println("l, r and mid : " + l + " "+ r + " "+ mid);
			if(arr.get(mid) == el) {
				System.out.println("Found element at : " + mid);
				break;
			}
			
			if(el > arr.get(mid)) {
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

import java.util.ArrayList;
import java.util.Scanner;

public class FindPivot {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = scanner.nextInt();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
		
		int mid, l, r, pivot;

		mid = arr.size()/2;
		l = 0;
		r = arr.size() - 1;
		int el;
		//System.out.println("Search element : " );
		//el = scanner.nextInt();
		
		while(l <= r) {
			
			//System.out.println("l, r and mid : " + l + " "+ r + " "+ mid);

			mid = (l+r)/2;
			if(r < l) {
				System.out.println("Array not rotated !");
			}
			
			if(r == l) {
				System.out.println("Pivot element :" + l);
				break;
			}
			
		
			if(mid+1 > r && mid-1 < l) {
				System.out.println("Pivot element Not Found !");
				break;
			}
			
			
			if(arr.get(mid) > arr.get(mid+1)) {		
				System.out.println("Pivot element is at location : " + (mid));
				break;
			}
			
			if(arr.get(mid) < arr.get(mid-1)) {
				System.out.println("Pivot element is at location : " + (mid-1));
				break;
			}
			
			if(arr.get(l) >= arr.get(mid)) {
				r = mid - 1;
				
			}
			else  {
				l = mid + 1;
			}
		}
	
	}

}
FindP


import java.util.*;
public class PairWithGivenSum {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = scanner.nextInt();
		
		/* Sample input Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
		   Output: true
		   There is a pair (6, 10) with sum 16
		*/
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
		
		System.out.println("Looking for pair with sum : ");
		int sum = scanner.nextInt();
	/*	
		//Brute force - O(n2)
		for(int i = 0; i< arr.size(); i++) {
			for(int j = i+1; j < arr.size(); j++) {
				if(arr.get(i) + arr.get(j) == sum) {
					System.out.println("Sum exists : i = " + arr.get(i)+ " j= "+ arr.get(j));
				}
			}
		}
		
		
		//2nd solution - Time O(n) + Space - O(n)
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int k = 0;
		for(int i = 0; i< arr.size(); i++) {
			System.out.println("hasmap in " + "i :" + hashmap);
			if(hashmap.containsValue(arr.get(i))) {
				System.out.println("Sum exists");
			}else {
				hashmap.put(k++, sum-arr.get(i));
			}
		}
		
		*/
		
		//3rd Solution
		
		// Find Pivot
	/*	int pivot;
		for(int i = 0;i < arr.size()-1; i++) {
			if(arr.get(i) > arr.get(i+1)) {
				pivot =i + 1;
				System.out.println("Pivot is at poisition : "+ pivot);
			} else {
				System.out.println("Looking for pivot.");
			}
		}
	*/
		
		// Find Pivot using binary search 2 4 6 8 10
		int pivot, mid, l, r;
		//for(int i = 0; i< arr.size();i++) {
			
		//}
		
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

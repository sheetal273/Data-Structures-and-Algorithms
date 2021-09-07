import java.util.HashSet;

public class FindMatch {

	public static void main(String[] args) {
		
		int n = 10;
		int arr[] = {3, 5, 7, 9, 13};
		
		int res[] = findMatch(arr, n);
		
		for(int i=0;i< res.length;i++) {
			System.out.println(" "+ res[i]);
		}
	}
	
	static int[] findMatch(int[] arr, int n) {
		
		int[] res = new int[2];
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i< arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int i=0;i< arr.length;i++) {
			if(set.contains(n-arr[i])) {
				res[0] = arr[i];
				res[1] = n-arr[i];
			}
		}
		
		return res;
	}
}

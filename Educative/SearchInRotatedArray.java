
public class SearchInRotatedArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,0,1,2};
		int el = 0;
		
		System.out.println("count : "+ search(arr, 0, arr.length-1, el));
	}
	

	
	static int search(int[] arr, int start, int end, int el) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = (start+ end)/2;
		
		if(arr[mid] == el) {
			return mid;
		}
		if(arr[start] <= arr[mid]) {
			
			//sorted half
			
			if(el >= arr[start] && el <= arr[mid]) {
				return search(arr, start, mid-1, el);
			}
			
			return search(arr, mid+1, end, el);
		}
		
		if(el >= arr[mid] && el <= arr[end] ) {
			return search(arr, mid+1, end, el);
		}
		
		return search(arr, start, mid-1, el);
	}
}

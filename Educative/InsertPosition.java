
public class InsertAtPosition {

public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,7};
		int el = 0;
		
		System.out.println("Pos : "+ InsertPos(arr, el));
		
	}

	private static int InsertPos(int[] arr, int el) {

		int start = 0;
		int end = arr.length -1;
		int pos = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
		
			if(arr[mid] == el) {
				return mid;
			}
			
			else if (arr[mid] < el) {
				start = mid +1;
				pos = mid+1;
			}
			else if(arr[mid] > el) {
				end = mid -1;
				pos = mid;
			}
		}
		
		return pos;
	}

}

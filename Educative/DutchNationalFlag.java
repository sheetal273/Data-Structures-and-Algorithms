
public class DutchNationalFlag {

	public static void main(String[] args) {
		
		int[] arr = {2, 0, 0, 1, 2, 1};
		
		dutchNationalFlag(arr);
		for(int i=0;i< arr.length;i++) {
			System.out.println(" " + arr[i]);
		}
	}

	private static void dutchNationalFlag(int[] arr) {
	
		int start =0; 
		int end = arr.length-1;
		int mid = start + (end - start)/2;
		
		while(start <= end && mid<= end) {
			
			System.out.println(".."+ mid);
			if(arr[mid] == 0) {
				// swap it with left el
				swap(arr, start, mid);
				
			}
			else if(arr[mid] == 2) {
				// swap it with right el
				swap(arr, mid, end);
				
				end --;
			}else if(arr[mid] == 1) {
				mid= mid+1;
			}
			
			
		}
	}

	private static void swap(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}

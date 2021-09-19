
public class CountElementOccurance {

	public static void main(String[] args) {
		
		int[] arr = {-5,-3,0,1,3,3,3,4,4,5};
		int el = 6;
		
		System.out.println("count : "+ count2(arr, el));
		
	}
	
static int count2(int[] arr, int el) {
		
		int start =0;
		int end = arr.length-1;
		int first_pos = -1;
		int last_pos = -1;
		
		while(start <= end) {

			int mid = (start+end)/2;
			
			if(arr[mid] == el) {
				first_pos = mid;
			}
			if(arr[mid] >= el) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		System.out.println("firstpos : "+ first_pos);
		
		start =0;
		end = arr.length-1;
		
		while(start <= end) {

			int mid = (start+end)/2;
			
			if(arr[mid] == el) {
				last_pos = mid;
			}
			if(arr[mid] > el) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		

		System.out.println("last pos : "+ last_pos);
		
		if(first_pos == -1 && last_pos == -1) {
			return -1;
		}
		
		return (last_pos - first_pos)+1;
	}

	
	
	static int count(int[] arr, int el) {
		
		int start =0;
		int end = arr.length-1;
		int first_pos;
		int last_pos;
		int count =0;
		
		while(start <= end) {

			int mid = (start+end)/2;
			
			if(arr[mid] == el) {
				
				int i=mid;
				while(i >= 0 && arr[i] == el) {
					count++;
					i--;
				}
				
				first_pos = i;
				
				i = mid+1;
				while(i< arr.length && arr[i]== el) {
					count++;
					i++;
				}
				
				last_pos = i;
				
			//	return last_pos - first_pos;
				return count;
				
			}else if(arr[mid] > el) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	
}

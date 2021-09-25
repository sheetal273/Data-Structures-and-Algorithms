
public class SparseSearch {
	
	public static void main(String[] args) {
		
		String[] array = {"", "educative", "", "", "",  "hello", "", "learning", "world", "", "", ""};

		String target = "hello";
		
		System.out.println(searchForString(array, target));
	}

	private static int searchForString(String[] arr, String target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == "") {
				
				int i = mid-1;
				int j = mid+1;
				
				
				while(true) {
					
					if(i < start && j > end) {
						return -1;
					}
					
					if(i >= start &&  arr[i] != "") {
						mid = i;
						break;
					}
					else if(j < end && arr[j] != "") {
						mid = j;
						break;
					}
					i--;
					j++;
				}
				
			}
			
			if(arr[mid].equals(target)) {
				return mid;
			}
			else if(arr[mid].compareTo(target) < 0) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			
			
		}
		
		return -1;
	}
	
	
}

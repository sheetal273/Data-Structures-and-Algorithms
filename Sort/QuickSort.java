
public class QuickSort {

	public static void main(String[] args) {
		

		int[] arr = {2, 13, 5, 6, 4, 8};

		quickSort(arr, 0, arr.length-1);
		for(int i=0;i< arr.length;i++) {
			System.out.println(" "+ arr[i]);
		}
		
	}
	
	static void quickSort(int[] arr, int left, int right) {
		
		if(left < right) {
			
			int p_index = partition(arr, left, arr[right], right);
			
			quickSort(arr, left, p_index-1);
			quickSort(arr, p_index+1, right);
			
		}
	}
	
	static int partition(int[] arr, int left, int pivot,  int right) 
	{
		int p_index = left;
		for(int i=left;i< right;i++) 
		{
			if(arr[i] <= pivot) {
				
				swap(arr, i, p_index);
				p_index++;
			}
		}
	
		swap(arr, p_index, right);
		return p_index;
	}
	
	
	static void swap(int[] arr, int i, int j) 
	{ 
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}

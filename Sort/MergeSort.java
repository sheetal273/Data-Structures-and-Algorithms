import java.util.LinkedList;


public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {2, 13, 5, 6, 4, 8};
		mergeSort(arr, 0, arr.length-1);
		
		for(int i=0;i< arr.length;i++) {
			System.out.println(" "+ arr[i]);
		}
		
	}
	
	static void mergeSort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int mid = low + (high-low)/2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
		}
	}
	
	static void merge(int[] arr, int low, int mid, int high) {
		
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] m1 = new int[n1];
		int[] m2 = new int[n2];
		
		int k =0;
		for(int i=0;i<n1;i++) {
			m1[i] = arr[low+i];
		}
		
		for(int i=0;i<n2;i++) {
			m2[i] = arr[mid+i+1];
		}
		
		int i=0,j=0;
		while(i < n1 && j < n2) {
			
			if(m1[i] < m2[j]) {
				arr[k+low] = m1[i++];
				k++;
			}
			else {
				arr[k+low] = m2[j++];
				k++;
			}
		}
		
		while(i<n1) {
			arr[k+low] = m1[i++];
			k++;
		}

		while(j<n2) {
			arr[k+low] = m2[j++];
			k++;
		}
		
	}
}

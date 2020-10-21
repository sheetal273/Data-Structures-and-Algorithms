package Coursera;

public class PeakElement {

	public static void main(String args[]) {
		
		int[] array = {310, 200, 150, 2, 23, 90, 120};
		
		System.out.println("Found Peak Element :" + peakElement(array));
	}

	private static int peakElement(int[] array) {
		
		if(array.length == 1) {
			return array[0];
		}
		
		if(array[0] > array[1]) {
			return array[0];
		}
		
		if(array[array.length-1] > array[array.length-2]) {
			return array[array.length-1];
		}
		
		for(int i = 1; i< array.length-1; i++) {
			
			if(array[i] > array[i - 1] && array[i] > array[i+1]) {
				
				return array[i];
		
			}		
		}
		return -1;
	}
	
	private static int peakElementWithBinarySearch(int[] array) {
		
		return findPeakUtil(array, 0, array.length);
	}
	
	
	private static int findPeakUtil(int[] array, int start, int end) {
		
		int mid = start + (end- start)/2;
		

		// if Mid == n-1 then there is no element at right to check
		// If Mid == 0 then there is no element at left
		if((mid == 0 || array[mid-1] <= array[mid]) 
				&& (mid == array.length-1 || array[mid] >= array[mid+1] )) {
				return mid;
		}
		else if(mid > 0 && array[mid] < array[mid-1]) {
				return findPeakUtil(array, start, mid-1);
		}
		else {
			return findPeakUtil(array, mid+1, end);
		}
		
	}
	
	
}

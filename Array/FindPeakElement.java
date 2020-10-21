package Coursera;

public class PeakElement {

	public static void main(String args[]) {
		
		int[] array = {310, 200, 150, 2, 23, 90, 120};
		
		System.out.println("Found Peak Element :" + peakElement(array));
		System.out.println("Found Peak Element : " + peakElement(array, 0, array.length));
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
	
	private static int peakElement(int[] array, int start, int end) {
		
		int mid = (start + end)/2;
		
		if(mid-1 >= 0 && mid+1 < array.length) {
			
			if(array[mid] > array[mid-1] && array[mid] > array[mid+1]) {
				return array[mid];
			}
			else if(array[mid-1] > array[mid+1]) {
				return peakElement(array, start, mid-1);
			}else {
				return peakElement(array, mid+1, end);
			}
		}
		
		// if Mid == n-1 then there is no element at right to check
		if(mid == array.length-1) {
			if(array[mid-1] < array[mid]) {
				return array[mid];
			}
		}
		
		// If Mid == 0 then there is no element at left
		if(mid == 0) {
			if(array[mid] > array[mid+1]) {
				return array[mid];
			}
		}
		return -1;
	}
	
}

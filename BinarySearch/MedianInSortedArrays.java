
public class MedianInSortedArrays {

	public static void main(String[] args) { 
		
		int[] arr1 = {2, 4, 6};
		int[] arr2 = {1, 3, 5, 7};
		
		
		System.out.println("Median is " + findMedian(arr1, arr2));
		
	}
	
	static double findMedian(int[] arr1, int[] arr2) { 
		
		  if(arr1.length > arr2.length){
	            return findMedian(arr2, arr1);
	        }
	        
	        int start =0;
			int end = arr1.length;
			
			int n1= arr1.length;
			int n2 = arr2.length;
			
			while(start <= end) { 
				
				int cut1 = (end + start)/2;
				int cut2 = (n1+n2)/2 - cut1;
			
				int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1-1];
				int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2-1];
				
				int right1 = cut1 == n1? Integer.MAX_VALUE : arr1[cut1];
				int right2 = cut2 == n2? Integer.MAX_VALUE : arr2[cut2];
				
				if(left1 <= right2 && left2 <= right1) { 
					
					if((n1+n2) %2 == 0) { 
						return (Math.max(left1, left2) + Math.min(right1, right2))/2.0; 
					}
					else {
						return Math.min(right1, right2);
					}
				}
				
				else if(left1 > right2) { 
					end = cut1-1;
				}
				else {
					start = cut1+1;
				}
				
			}
			
			return 0.0;
	}
}

import java.util.HashMap;
import java.util.HashSet;

public class CountingElements {

	
	 public int countElements(int[] arr) {
	  
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(int i=0;i< arr.length;i++) {
			 if(!set.contains(arr[i])) {
				 set.add(arr[i]);
			 }
		 }
		 
		 int result =0;
		 for(int i=0;i< arr.length;i++) {
			 
			 if(set.contains(arr[i]+1)) {
				 result++;
			 }
			 
		 }
		 
		 return result;
	  }
	 
	public static void main(String args[]) {
		int[] arr = {1,1,2,2};
		CountingElements obj = new CountingElements();
		System.out.println("Output: " +  obj.countElements(arr));
		
	}
}

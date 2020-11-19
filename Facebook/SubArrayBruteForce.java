import java.util.ArrayList;

public class SubArray {

	public static void main(String args[]) {
		
		int N = 5;
		int S = 12;
		int[] arr = {1,2,3,7,5};
		
		ArrayList<Integer> indexList = subarraySum(N, S, arr);
		
		for(int index: indexList) {
			System.out.println(index);
		}
	}
	
	  static ArrayList<Integer> subarraySum(int n, int s, int[] m) {
	        
		  
		  ArrayList<Integer> indexList = new ArrayList<Integer>();
		
		  int sum=0;
		  boolean found = false;
		  for(int i=0;i< n; i++) {
			  
			  sum =0;
			  for(int j=i;j< n;j++) {
				  
				  sum = sum + m[j];
				  if(sum == s) {
					  indexList.add(i+1);
					  indexList.add(j+1);
					  found = true;
					  break;
				  }
			  }
			  if(found) {
				  break;
			  }
		  }
		  if(!found) {
			  indexList.add(-1);
		  }
		  
		  return indexList;
	    }
}

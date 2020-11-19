import java.util.ArrayList;

public class SubArray {

	public static void main(String args[]) {
		
		int N = 5;
		int S = 17;
		int[] arr = {1,2,3,7,10};
		
		ArrayList<Integer> indexList = subarraySumOptimized(N, S, arr);
		
		for(int index: indexList) {
			System.out.println(index);
		}
	}
	
	static ArrayList<Integer> subarraySumOptimized(int n, int s, int[] m) {
          
		  ArrayList<Integer> indexList = new ArrayList<Integer>();
		
		  int start =0;
		  int end = 0;
		  int sum =0;
		  
		  for(int i =0;i< n; i++) {
			  
			  sum = sum + m[i];
			
			  while(sum > s) {
				  sum = sum - m[start];
				  start++;
			  }
			  
			  if(sum == s ) {
				  indexList.add(start+1);
				  indexList.add(end+1);
				  break;
			  }
			  end ++;
		  }
		  if(indexList.size()<1) {
			  indexList.add(-1);
		  }
		    
		  return indexList;
	    }
	
}

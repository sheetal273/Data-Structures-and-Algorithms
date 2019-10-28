
import java.util.*;

public class LargestNumber {

	
	 public String largestNumber(final int[] A) {
		 
		
		 Vector<String> str = new Vector<String>(A.length);
		 
		 
		 for(int i=0;i<A.length;i++ ) {
			 str.add(String.valueOf(A[i]));
		 }
		 
		 Collections.sort(str, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				// TODO Auto-generated method stub
				String XY = X + Y;
				String YX = Y + X;
				
				return XY.compareTo(YX) > 0 ? -1: 1;
			}
			 
		});
		 
		 Iterator it = str.iterator(); 
		  StringBuilder max = new StringBuilder();
		  int count =0;
		  int j=0;
		    while(it.hasNext()) {
		      //  System.out.print(it.next());   
		    	int number = Integer.valueOf(it.next().toString());
		        max = max.insert(j++,String.valueOf(number));
		        if(number == 0) {
		        	count ++;
		        }
		    } 
		 if(count == str.size()) {
			 max.delete(0, max.length());
			 max.insert(0, "0");
		 }
		 return max.toString();
	
	 }
	 
	public static void main(String args[]) {
		
		int[] A = {0, 0, 0, 0, 0}; //9534330 // 9534303 //988613
		LargestNumber obj = new LargestNumber();
		System.out.println(" largest number: " + obj.largestNumber(A));

	//	System.out.println(" largest number2: " + obj.findMax(A)) // ;

		//System.out.println(" largest number3: " + obj.findMax(A));
		
	}
}


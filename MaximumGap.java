import java.util.Arrays;

public class MaximumGap {

	 public int maximumGap(final int[] A) {
	    
		 Arrays.sort(A);
		 int max=0;
		 for(int i=0;i< A.length && i+1 < A.length;i++) {
			 int n = java.lang.Math.abs(A[i+1] - A[i]);
			 if(max < n) {
				 max = n; 
			 } 
		 }
		 
		 return max;
	 }
	 public static void main(String args[]) {
		 int[] A = {1, 10, 5};
		 MaximumGap obj = new MaximumGap();
		 System.out.print(obj.maximumGap(A));
	 }
}


public class MaxNonNegativeArray {

	public int[] maxset(int[] A) {
    
		int start= 0, end =0, rstart = 0, rend =0;
		
		long sum=0,maxsum =0;
		for(int i = 0; i < A.length; i ++) {
			if(A[i] < 0) {
			//	System.out.println("Negative number : " + rstart + " end: "+ rend);
				start = i + 1;
				end = i+1;
				sum = 0;
			}else {
				sum = sum + A[i];
				System.out.println("Else block sum: " + sum);
			}
			if(maxsum == sum && ( i-start == rend-rstart) || ( i-start > rend-rstart)) {
						if(rstart > start) {
							rstart = start;
							rend = i;
						}else if(maxsum == 0 && A[i] == 0) {
							//rstart = start;
							rstart = start;
							rend = i;
							System.out.println("Maximum sum so far: " + maxsum + " Element: "+ A[i]);
							//rend = end -2;
						}
					// maxsum = sum;
			}
			if(maxsum < sum) {
			
					maxsum = sum;
					rstart = start;
					rend = i;
				System.out.println("Maximum sum so far: " + maxsum);
			}		
		}
		
		
		int k = 0;
		int result[] = new int[rend-rstart+1];
		for(int i = rstart; i <= rend; i++) {
			if(A[i] >= 0) {
				result[k++] = A[i];
			}
		}

		int r[] = new int[0];
		System.out.println("Maxsum: "+ maxsum + " Start: " + rstart + " End: " + rend + " Result array size: " + result.length + "K = " +k);
		if(k <= 0) {
			return r;
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		int[] A = {1967513926, 1540383426, -1303455736, -521595368  };
		MaxNonNegativeArray obj = new MaxNonNegativeArray();
		System.out.print(obj.maxset(A));
	}
}

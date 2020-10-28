
public class UglyNumber {

	public static void main(String[] args) {
		
		int N = 150;
		
		System.out.println(GetUglyNumberUsingRecurssion(N));

		
	}

	 
	 public static long GetUglyNumberUsingRecurssion(int N) {
		 
		 long ugly[] = new long[N];
		 ugly[0] = 1;
		 
		 long next_ugly_number = 1;
		 
		 long next_multiple_of_2 = 2;
		 long next_multiple_of_3 = 3;
		 long next_multiple_of_5 = 5;
		 
		 
		 int i2 =0, i3 = 0, i5= 0;
		 
		 
		 for(int i =1; i< N; i++) {
			 
			 next_ugly_number = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
			 ugly[i] = next_ugly_number;
			 
			 if(ugly[i] == next_multiple_of_2) {
				 
				 i2 = i2+1;
				 next_multiple_of_2 = ugly[i2] * 2;
				 
			 }
			 
			 if(ugly[i] == next_multiple_of_3) {
				 
				 i3 = i3+1;
				 next_multiple_of_3 = ugly[i3] * 3;
				 
			 }

			 if(ugly[i] == next_multiple_of_5) {
	 
				 i5 = i5+1;
				 next_multiple_of_5 = ugly[i5] * 5;
	 
			 }
			 
		 }
		 
		 return ugly[N-1];
	 }
}

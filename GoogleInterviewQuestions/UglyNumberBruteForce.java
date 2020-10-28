
public class UglyNumber {

	public static void main(String[] args) {
		
		int N = 15;
		
		System.out.println(getNthUglyNo(N));

		
	}

	private static boolean isUglyNumber(long N) {
		// TODO Auto-generated method stub
		
		long temp = N;
		
		while(temp % 2 == 0) {
			temp = temp /2;
		}
		while(temp % 3 == 0) {
			temp = temp /3;
		}
		while(temp % 5 == 0) {
			temp = temp /5;
		}
		
		if(temp == 1) {
			return true;
		}
		
		return false;
		
	}
	
	 public static long getNthUglyNo(int N) {
	        // code here
		
		 if(N < 4) {
				return N;
		 }
		 
		long k = 4;
		int count = 3;
		 
		while(count != N) {
			
			if(isUglyNumber(k)) {
				count ++;
			}
			k ++;
		}
		 
		 return k-1;
	    }
}

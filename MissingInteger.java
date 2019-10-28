
public class MissingInteger {

	public int firstMissingPositive(int[] A) {
    
	
		int n;
		int min = findMin(A);
		if(min == 32768) {
			return 1;
		}
		if(min!=1) {
			return 1;
		}
		System.out.println("Minimum number: "+ min);
			for(int i=0;i<A.length;i++) {
				if(!checkNumberExists(A,min++) ) {
					return min-1;
				}
			}
		return min;
	}
	
	public int findMin(int[] A) {
		int min= 32768;
		for(int i=0;i< A.length;i++) {
			if(min > A[i] && A[i] > 0) {
				min = A[i];
			}
		}
		return min;
	}
	
	public boolean checkNumberExists(int[] A, int number) {
		System.out.println("Checking for number: " + number);
		
		for(int i=0;i<A.length;i++) {
			if(A[i] == number) {
				return true;
			}
		}
		System.out.println("Notr exists ");
		return false;
	}
	
	public static void main(String args[]) {
	
		int[] A = {1}; //1,0,-1,3 {1 2 -1} = 1 0 -1 
		MissingInteger obj = new MissingInteger();
		System.out.print(" "+ obj.firstMissingPositive(A));
		//System.out.print("Max = " +  obj.findMax(A));
	}
}

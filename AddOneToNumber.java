
public class AddOneToNumber {

	public int[] plusOne(int[] A) {
		
		int result[] = new int[A.length + 1];
		int carry = 0;
		int sum = 0;
		int k = A.length;
		sum = A[A.length - 1] + 1;
		
		for(int i = A.length-1; i >=0; i--) {
			sum = i == A.length-1 ? A[i] + 1 : A[i]+ carry;
			if(sum >= 10) {
				result[k--] = sum % 10;
				carry = sum / 10;
			}
			else {
				result[k--] = sum;
				carry = 0;
			}
		}
		
		if(carry == 1) {
			result[k--] = carry;
		}

		//System.out.println("K = " + (k+1));
		
		int start=0;
		for(int l=0;l<result.length;l++) {
			if(result[l]!=0) {
				start = l;
				break;
			}
		}
		System.out.println("Non zero = " + (start));
		int m =0;
		
		int r[] = new int[result.length-start];
		
		for(int j=start;j<result.length;j++) {
			r[m++] = result[j];
		}
		for(int j=0;j < r.length; j++) {
			System.out.print(r[j] + " ");
		}
	    return r;
	}

public static void main(String args[]) {
	
	int[] A = {0};
	AddOneToNumber obj = new AddOneToNumber();
	obj.plusOne(A);
}
}

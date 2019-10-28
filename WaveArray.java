import java.util.Arrays;

public class WaveArray {

	public int[] wave(int[] A) {
    
		//int temp;
	/*	for(int i=0;i< A.length;i++) {
			for(int j=i+1;j < A.length;j++) {
				if(A[j] < A[i]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		
		*/
		
		Arrays.sort(A);
		for(int i=0;i< A.length;i++) {
			System.out.print(" " + A[i]);
		}
		
		for(int i=0;i< A.length;i= i+2) {
			if(i+1 < A.length) {
				int temp = A[i];
				A[i] = A[i+1];
				A[i+1] = temp;
			}
				
		}
		System.out.println("\n After sorting\n");
		for(int i=0;i< A.length;i++) {
			System.out.print(" " + A[i]);
		}
		
		return A;
	}
	
	public static void main(String args[]) {
		
		int[] A = { 6, 17, 15, 13 };
		WaveArray obj = new WaveArray();
		obj.wave(A);
	}
}

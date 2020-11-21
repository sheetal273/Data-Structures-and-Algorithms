
public class Power {

	public static void main(String[] args) {
		
		double x = 0.00001;
		int n = -3;
		System.out.println(myPow(x, n));
	}
	
	 public static double myPow(double x, int n) {
	 
		 
		// System.out.println(".."+ n);
		 if(n == 0) {
			 return 1;
		 }
		 else if(n % 2 == 0){
			 double result = myPow(x, n/2);
			 return result * result;
		 }
		 else if(n < 0) {
			 return 1/ myPow(x, Math.abs(n));
		 }
		 return x * myPow(x, n-1);
	 }
	 
}

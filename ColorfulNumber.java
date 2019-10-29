import java.util.HashSet;

public class ColorfulNumber {

	
	public int colorful(int A) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		String num = String.valueOf(A);
		for(int i=0;i<= num.length();i++) {
			for(int j=i;j<=num.length(); j++) {
				String str = num.substring(i, j);
				if(str.length() > 0) {
					int prod = findProd(Integer.parseInt(str));
					if(set.contains(prod)) {
						return 0;
					}
					set.add(prod);
				}
				
				
			}
		}
		return 1;
    }
	
	private int findProd(int num) {
		// TODO Auto-generated method stub
		int prod = 1;
		while(num > 0) {
			prod*= num%10;
			num = num /10;
		}
		return prod;
	}

	public static void main(String[] args) {
		int A = 23;
		ColorfulNumber obj = new ColorfulNumber();
		System.out.println(obj.colorful(A));	
	}
}

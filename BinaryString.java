import java.util.ArrayList;

public class BinaryString {

	

	 public boolean queryString2(String S, int N) {
	 
		 for(int i=1; i<= N;i++) {
			 if(S.indexOf(Integer.toBinaryString(i)) == -1) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	 
	
	public static void main(String[] args) {
		
	//	String S = "110101011011000011011111000000";
		String S = "110101011011000011011111000000";
		int N  = 15;
		BinaryString obj = new BinaryString();
		System.out.println("Output: "+ obj.queryString2(S, N));
	//	obj.generateBinary(10);
		
	}
}

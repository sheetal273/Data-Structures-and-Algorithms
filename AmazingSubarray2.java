
public class AmazingSubarray2 {

	 public int solve(String A) {
		
		 int sum =0;
		 for(int i=0;i< A.length();i++) {
			 
			 if(isVowel(A.charAt(i))) {
				 sum = sum + A.length() - i;	
			 }
		 }
		 
	 return sum % 10003;
	 }
	 
	 
	 private boolean isVowel(char str) {
		 str = Character.toLowerCase(str);
		 if(str == 'a' || str == 'e' || str == 'o' || str == 'i' || str == 'u') {
			 return true;
		 }
		 return false;
	 }
	 
	public static void main(String args[]) {
		String str = "ABEC";
		AmazingSubarray2 obj = new AmazingSubarray2();
		System.out.println(obj.solve(str));
	}
}

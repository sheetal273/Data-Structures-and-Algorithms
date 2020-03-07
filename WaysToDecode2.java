//https://www.youtube.com/watch?v=qli-JCrSwuk
public class WaysToDecode2 {

	 public int numDecodings(String s) {
	 
		int[] mem = new int[s.length()+1];
		for(int i=0;i<= s.length();i++) {
			mem[i] = -1;
		}
		 return decode(s, s.length(), mem);
	 }
	 
	 
	 public int decode(String str, int k, int[] mem) {
		 
		 System.out.println("checking for : "+ k);
		 if(str == "" || k==0) {
			 return 1;
		 }
		 
		 if(str.charAt(str.length() - k) == '0') {
			 return 0;
		 }
		 
		 if(mem[k] != -1) {
			 return mem[k];
		 }
		 // 123 = 1 + decode ("23") , 12 + decode("3")
		 int result = decode(str, k-1, mem);
		 
		 if(k >= 2 && Integer.parseInt(str.substring(str.length()-k, str.length()-(k-2))) < 27) {
			 result = result + decode(str, k-2, mem);
		 }
		 mem[k] = result;
		 return result;
	 }
	 
	public static void main(String[] args) {
	
		String s = "123";
		WaysToDecode2 obj = new WaysToDecode2();
		System.out.println("Ans : "+ obj.numDecodings(s));
	}
}

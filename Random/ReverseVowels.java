
public class ReverseVowels {

	public static void main(String args[]) {
	
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}
	
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
			return true;
		}
		
		return false;
	}
	public static String reverseVowels(String s) {
     
		
		StringBuilder sb = new StringBuilder();
		for(char ch: s.toCharArray()) {
			if(isVowel(ch)) {
				sb.append(ch);
			}
		}
		String rev = sb.reverse().toString();
		System.out.println("rev  = "+ rev);
		int k =0;
		
		StringBuilder sb_copy = new StringBuilder(s);
		for(int i=0;i< s.length(); i++) {
			
			char ch = s.charAt(i);
			if(isVowel(ch)) {
				sb_copy.setCharAt(i, rev.charAt(k++));
			}
		}
		
		return sb_copy.toString();
    }
}


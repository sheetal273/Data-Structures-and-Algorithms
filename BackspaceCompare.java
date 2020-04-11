
public class BackspaceCompare {

	public boolean backspaceCompare(String S, String T) {
     
		if(S.equals(T)) {
			return true;
		}
		
		
		
		for(int i=0;i< S.length();i++) {
			
			if(S.charAt(i) == '#' && i-2 >=0) {	
				S = S.substring(0, i-2+1) + S.substring(i+1, S.length());
				i = i-2;
			}else if(S.charAt(i) == '#') {
				S = S.substring(i+1, S.length());
				i =-1;
			}
		}
		
		for(int i=0;i< T.length();i++) {
			if(T.charAt(i) == '#' && i-2 >=0) {
				T = T.substring(0, i-2+1) + T.substring(i+1, T.length());
				i = i-2;
			}else if(T.charAt(i) == '#') {
				T = T.substring(i+1, T.length());
				i=-1;
			}
		}
		
		if(S.equals(T)) {
			System.out.println("Strings are equal!");
			return true;
		}
		
		return false;
		
    }
	
	public static void main(String[] args) {
	
		String s = "a#c";
		String t = "b";
		BackspaceCompare obj = new BackspaceCompare();
		System.out.println("String are equal? : " + obj.backspaceCompare(s, t));
	}
}

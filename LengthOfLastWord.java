import java.io.Console;

public class LengthOfLastWord {

	public LengthOfLastWord() {
		// TODO Auto-generated constructor stub
	}
	public int lengthOfLastWord(final String A) {
		
		String arr[]= A.split(" ");
		if(arr.length == 0) {
			return 0;
		}
		return arr[arr.length-1].length();
    }
	
	public static void main(String args[]) {
		String str = "   test     hello you my miss     ";
		LengthOfLastWord obj = new LengthOfLastWord();
		//obj.lengthOfLastWord(str);
		System.out.println(obj.lengthOfLastWord(str));
		// obj.lengthOfLastWord(str);
	}
}

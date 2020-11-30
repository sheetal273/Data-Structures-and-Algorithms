import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  public static String findEncryptedWordhelper(String s, int start, int end, StringBuilder sb) {
	    // Write your code here
		
	    
		if(s.isEmpty()) {
			return "";
		}
		if(start < 0 || start >= s.length() || end < 0|| end >= s.length()) {
			return sb.toString();
		}
		
		if(start == end) {
			return sb.append(s.charAt(start)).toString();
		}
		
		int mid = (start + end)/2;
		
				
		sb.append(s.charAt(mid));
				
		if(mid -1 >= start) {
			findEncryptedWordhelper(s, start, mid-1, sb);
		}
		if(mid+1 <= end) {
			findEncryptedWordhelper(s, mid+1, end, sb);
		}
	
		return sb.toString();
	  }

  String findEncryptedWord(String s) {
    // Write your code here
    return findEncryptedWordhelper(s, 0, s.length()-1, new StringBuilder());
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(String expected, String output) {
    boolean result = (expected.equals(output));
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printString(expected); 
      System.out.print(" Your output: ");
      printString(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printString(String str) {
    System.out.print("[\"" + str + "\"]");
  }
  
  public void run() {
    String s_1 = "abc";
    String expected_1 = "bac";
    String output_1 = findEncryptedWord(s_1);
    check(expected_1, output_1);

    String s_2 = "abcd";
    String expected_2 = "bacd";
    String output_2 = findEncryptedWord(s_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
}

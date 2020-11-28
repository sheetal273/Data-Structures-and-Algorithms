import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class MatchingPairs {

  // Add any helper functions you may need here
  

  int matchingPairs(String s, String t) {
    // Write your code here
    	int count =0;
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		
		int m = 0;
		while(m < s.length() && s.charAt(m) == t.charAt(m)) {
			m++;
		}
		
		int n = s.length()-1;
		while(n >=0 && s.charAt(n) == t.charAt(n)) {
			n--;
		}
		if(m> s.length()-1) {
			m = m-1;
		}
		if(n<0) {
			n = n+1;
		}
		StringBuilder sb = new StringBuilder(t);
		if(m >= 0 && m < s.length() && n>=0 && n < t.length()) {
		
			char temp = t.charAt(m);
			sb.setCharAt(m, t.charAt(n));
			sb.setCharAt(n, temp);
			
		}
		for(int i = 0;i<t.length();i++) {
			if(s.charAt(i) == sb.charAt(i)) {
				count++;
			}
		}
		return count;
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(int expected, int output) {
    boolean result = (expected == output);
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printInteger(expected); 
      System.out.print(" Your output: ");
      printInteger(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printInteger(int n) {
    System.out.print("[" + n + "]");
  }
  public void run() {
    String s_1 = "abcde";
    String t_1 = "adcbe";
    int expected_1 = 5;
    int output_1 = matchingPairs(s_1, t_1);
    check(expected_1, output_1);

    String s_2 = "abcd";
    String t_2 = "abcd";
    int expected_2 = 2;
    int output_2 = matchingPairs(s_2, t_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  public static void main(String[] args) {
    new MatchingPairs().run();
  }
}

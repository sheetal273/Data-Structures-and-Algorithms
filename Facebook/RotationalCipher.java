import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  String rotationalCipher(String input, int rotationFactor) {
    // Write your code here
	StringBuilder result = new StringBuilder();
		for(int i =0 ;i< input.length();i++) {
			
			int ch = (int)input.charAt(i);
			if((ch >= 65 && ch <=90) || (ch >=90 && ch <=122)) {
				
		
				if(ch >= 65  && ch <= 90 && ch + rotationFactor > 90) {
					// needs adjustment
					int pos = ch + rotationFactor -90 + 64;
					while(pos > 90) {
						
						pos = pos-90+64;
					}
					
					result.append((char) pos);
				
				}
				
				else if(ch >= 97 && ch <= 122 && ch + rotationFactor > 122) {
					// needs adjustment
					int pos = ch + rotationFactor -122 + 96;
					while(pos > 122) {
						
						pos = pos-122+96;
					}
					result.append((char) pos);
		
				}
				else {
					result.append((char)((int)input.charAt(i)+ rotationFactor));
				}
				
			} else if(Character.isDigit(input.charAt(i))){
				
				int num = input.charAt(i) - '0';
				if(num + rotationFactor > 9) {
					
					num = num + rotationFactor;
					while(num > 9) {
						num = num-10;
					}
					result.append(num);
					
				}else {
					result.append(input.charAt(i) - '0' + rotationFactor);
				}
			}
			else {
			
				result.append(input.charAt(i));
			}
		}
		
		return result.toString();
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
    String input_1 = "All-convoYs-9-be:Alert1.";
    int rotationFactor_1 = 4;
    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
    String output_1 = rotationalCipher(input_1, rotationFactor_1);
    check(expected_1, output_1);

    String input_2 = "abcdZXYzxy-999.@";
    int rotationFactor_2 = 200;
    String expected_2 = "stuvRPQrpq-999.@";
    String output_2 = rotationalCipher(input_2, rotationFactor_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
}

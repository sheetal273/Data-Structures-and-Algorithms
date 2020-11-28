import java.util.Scanner;

public class ReverseOnlyLetters {
	
	public static void main(String[] args) {
	
	//	String str = "Test1ng-Leet=code-Q!";
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
	
		
		while(T > 0) {
			
			String str = scanner.next();
			System.out.println(reverseOnlyLetters(str));
			T--;
		}
		
	}
	
	  public static String reverseOnlyLetters(String S) {
	      
		  StringBuilder sb = new StringBuilder(S);
		  String rev = sb.reverse().toString();
		  int k =0;
		  StringBuilder res = new StringBuilder();
		  for(int i=0;i< S.length();i++) {
			  
			  if(Character.isAlphabetic(S.charAt(i))) {
				  
				  while(!Character.isAlphabetic(rev.charAt(k))) {
					  k++;
				  }
				  res.append(rev.charAt(k++));
				  
			  }else {
				  res.append(S.charAt(i));
			  }
		  }
		  
		  
		  return res.toString();
	   }
}

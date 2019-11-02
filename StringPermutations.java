import java.util.ArrayList;

public class StringPermutations {

	  public void permute(String A, int l, int r) {
	  
		  
		  if(l == r) {
			  System.out.println(" "+ A);
		  }
		  
		  
		  for(int i=l;i<=r;i++) {
			  
			  A= swap(A, l, i);
			  permute(A, l+1, r);
			  A=swap(A, l, i);
			  
		  }
	
	  }
	  
	  private String swap(String A, int x, int y) {

		  char ch[] = A.toCharArray(); 
		  char temp = ch[x]; 
		  ch[x] = ch[y]; 
		  ch[y] = temp; 
 		  return String.valueOf(ch); 
	  }

	
	public static void main(String[] args) {
	
		StringPermutations obj = new StringPermutations();
		
		obj.permute("ABC", 0, 2);
	
	}
}

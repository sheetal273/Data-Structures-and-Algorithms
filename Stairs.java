
public class Stairs {

	int count=0;
	  public int climbStairs(int A) {
	   
	  System.out.println("calling a with :"+A);
		  if(A < 0) {
			  return 0;
		  }
		  if(A == 1 || A==0) {
			  return 1;
		  }
		
		return (climbStairs(A-1) + climbStairs(A-2));
		
	  }
	  
	  
	  
	  
	public static void main(String[] args) {
		
		int stairs = 2;
		Stairs obj = new Stairs();
		System.out.println("fcount ="+obj.climbStairs(stairs));
	}
}


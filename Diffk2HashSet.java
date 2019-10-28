import java.util.HashSet;

public class Diffk2HashSet {

	
	 public int diffPossible(final int[] A, int B) {
	 
		 if(A.length <= 1) {
			 return 0;
		 }
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(int num: A) {
			 if(set.contains(num - B) || set.contains(num + B)) {
				 return 1;
			 }
			 set.add(num);
		 }
		 
		 return 0;
	 }
	 
	public static void main(String[] args) {
	
		int A[] = {11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13};
		int B =60;
		Diffk2HashSet obj = new Diffk2HashSet();
		System.out.println(obj.diffPossible(A, B));
	}
}

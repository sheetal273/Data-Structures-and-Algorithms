
public class StringShifts {

	public String stringShift(String s, int[][] shift) {
        
		for(int[] arr: shift) {
			
			
			//Left shift
			if(arr[0] == 0) {

				for(int i=1;i <= arr[1];i++) {
					s = s.substring(1, s.length()) + s.charAt(0);
				}
			}
			
			// Right shift
			if (arr[0] == 1) {
				for (int i = 1; i <= arr[1]; i++) {
					s = s.charAt(s.length()-1) + s.substring(0, s.length() - 1); 
				}
			}
		}
		
		return s;
    }
	public static void main(String[] args) {

		String s = "abcdefg";
		int shift[][] = {{1,1},{1,1},{0,2},{1,3}};
		StringShifts obj = new StringShifts();
		System.out.println("String: " + obj.stringShift(s, shift));
	}
}
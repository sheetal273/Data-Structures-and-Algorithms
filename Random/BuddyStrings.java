class Solution {
    public boolean buddyStringsOptimal(String A, String B) {
       if(A.length() != B.length() ||  A.length() == 0 || B.length() == 0) {
			return false;
		}
		
		if(A.equals(B)) {
			HashSet<Character> set = new HashSet<Character>();
			for(char ch: A.toCharArray()) {
				set.add(ch);
			}
			
			if(set.size() < A.length()) {
				// ab => 2, aa => 1, a=> 1, aab =>1
				return true;
			}else {
				return false;
			}
		}
		
		ArrayList<Integer> diff = new ArrayList<>();
		
		for(int i=0;i< A.length();i++) {
			
			if(A.charAt(i) != B.charAt(i)) {
				diff.add(i);
			}
		}
		
		if(diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
				 && B.charAt(diff.get(0)) == A.charAt(diff.get(1))) {
			return true;
		}else
		{
			return false;
		}

    }
public static boolean buddyStrings(String A, String B) {
        
		if(A.length() != B.length() ||  A.length() == 0 || B.length() == 0) {
			return false;
		}
		
		if(A.equals(B) && A.length() > 1) {
		
			boolean matched = true;
			for(int i =0 ;i< A.length();i++) {
				if( i+1 < A.length() && A.charAt(i)!= A.charAt(i+1)) {
					matched = false;
					break;
				}
			}
			if(matched) {
				System.out.println("matched");
				return true;
			}
		}
		
		for(int i =0;i< A.length();i++) {
			
			for(int j = 0;j< B.length();j++) {
			
				if(i != j) {
					StringBuilder sb = new StringBuilder(B);
					char temp = B.charAt(i);
					sb.setCharAt(i, B.charAt(j));
					sb.setCharAt(j, temp);
					
					if(A.equals(sb.toString())) {
						return true;
					}
				}
				
				
			}
		}

		return false;
	}
	
}

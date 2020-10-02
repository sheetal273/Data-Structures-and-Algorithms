class GfG{
	public boolean isInterLeave(String a,String b,String c)
	{
	    if(a.length() > c.length() || b.length() > c.length() ) {
			    return false;
		  }
     return isInterLeave1(0,0,0,a,b,c);
	}
	
	public static boolean isInterLeave1(int i, int j, int k, String A, String B, String C)
	{
	if(A.length() == 0 || B.length() == 0 || C.length() == 0) {
			return false;
		}
		if(i == A.length() && j == B.length()) {
			return true;
		}
		
		if(k >= C.length()) {
			return false;
		}
		
		boolean answer = false;
		if(i < A.length() && A.charAt(i) == C.charAt(k)) {
			answer = answer | isInterLeave1(i+1, j, k+1, A, B, C);
		}
		if(j < B.length() && B.charAt(j) == C.charAt(k)) {
			answer = answer | isInterLeave1(i, j+1, k+1, A, B, C);
		}

		return answer;
	}

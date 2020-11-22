class Solution {
    public static List<String> restoreIpAddresses(String s) {
        
		List<String> list = new ArrayList<>();
		restoreIpAddresses(s, 0, "", 3, list);
		return list;
    }
	
	public static boolean isValid(String ip, int len) {
		
		if(ip.length() > 1) {
			if(ip.startsWith("0") || Integer.valueOf(ip) > 255) {
				
				return false;
			}
		}
		
		return true;
	}
	
	 public static List<String> restoreIpAddresses(String s, int start, String ip, int dots, List<String> list) {

		 if(dots == 0) {
			 if(s.substring(start, s.length()).length() < 4 && isValid(s.substring(start, s.length()), s.length()-start)) {
			 ip = ip + s.substring(start, s.length());
			
			 System.out.println(" "+ ip);
			 list.add(ip);
			 }
		 }
		 if(dots > 0){
		 if(start+1< s.length()) {
			 restoreIpAddresses(s, start+1, ip+ s.substring(start, start+1) +".", dots-1, list);
		 }
		 if(start+2< s.length() && isValid(s.substring(start, start+2), 2)) {
		 		 
			 restoreIpAddresses(s, start+2, ip+ s.substring(start, start+2)+".", dots-1, list); 
		 }
		 if( start+3< s.length() && Integer.valueOf(s.substring(start, start+3)) < 256 && isValid(s.substring(start, start+3), 3))
		 {
			 
			 restoreIpAddresses(s, start+3, ip+ s.substring(start, start+3)+".", dots-1, list);
		 }
         }
		 return list;
	 }
	
}

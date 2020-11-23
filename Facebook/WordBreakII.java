class Solution {
    
	public HashMap<String, List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
         if(map.containsKey(s)) {
			  return map.get(s);
		  }
		  
		  List<String> results = new ArrayList<>();
		  if(s.length() < 1) {
			  results.add("");
			  return results;
		  }

		
		  for(String words: wordDict) {
			  
			  if(s.startsWith(words)) {
				  
				  String sub = s.substring(words.length());
				  List<String> rightList = wordBreak(sub, wordDict);
				  
				  for(String w: rightList) {
					  String optionalSpace = w.isEmpty() ? "" : " ";
					  results.add(words + optionalSpace + w);
				  }
				  
			  }
		  }
	
		  map.put(s, results);
		  
		  return results;
    }
}

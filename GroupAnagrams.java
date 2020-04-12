import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	 public List<List<String>> groupAnagrams1(String[] strs) {
	     
		 List<List<String>> anagrams = new ArrayList<List<String>>();
		 HashSet<String> set = new HashSet<String>();
		 

		 List<String> list = new ArrayList<String>();
		 for(int i=0;i< strs.length;i++) {
			 			
			 if(!set.contains(strs[i])) {
				 list = new ArrayList<String>();
				 list.add(strs[i]);
				 set.add(strs[i]);

		
			 
			 for(int j=i+1;j< strs.length;j++) {
				 
				 if(CheckAnagram(strs[i], strs[j])) {
					 System.out.println("Matched");
					 list.add(strs[j]);
					 set.add(strs[j]);
				 }
			 	}
				 anagrams.add(list);
			 }
			 }
		 
		 for(List<String> tlist: anagrams) {
			 System.out.println();
			 for(String item : tlist) {
				 System.out.print(" " + item);
			 }
		 }
		 
		 return anagrams;
	 }
	
	public boolean CheckAnagram(String str1, String str2) {
//		System.out.println("checking for anagrams " + str1 + " str2: "+ str2);
		int count[] = new int[256];
		
		for(int i=0;i< str1.length();i++) {
			count[str1.charAt(i)] ++;
		}
		
		for(int i=0;i< str2.length();i++) {
			count[str2.charAt(i)]--;
		}
		
		for(int j=0; j< count.length;j++) {
			if(count[j] > 0 || count[j] < 0) {
				return false;
			}
		}
		return true;
	}
	 
	public List<List<String>> groupAnagrams(String[] strs) {
	     
		 List<List<String>> anagrams = new ArrayList<List<String>>();
		 HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		 for(String str: strs) {
			 char[] characters = str.toCharArray();
			 Arrays.sort(characters);
			 String sorted = new String(characters);
			 
			 if(!map.containsKey(sorted)) {
				 map.put(sorted, new ArrayList<String>());
			 }
			 map.get(sorted).add(str);
		 }
		 
		 anagrams.addAll(map.values());
		 
		 for(List<String> tlist: anagrams) {
			 System.out.println();
			 for(String item : tlist) {
				 System.out.print(" " + item);
			 }
		 }
		 
		 return anagrams;
	 }
	
	public static void main(String[] args) {
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
	//	String[] strs = {"",""};
		GroupAnagrams obj = new GroupAnagrams();	
		System.out.println(" Anagrams  : "+ obj.CheckAnagram("", ""));
		obj.groupAnagrams(strs);	
	}
}

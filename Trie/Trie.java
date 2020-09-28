import java.util.Scanner;

public class Trie {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T > 0) {
		
			
		int length = scanner.nextInt();
		
		String keys[] = new String[length];
		for(int i=0; i< length;i++) {
			keys[i] = scanner.next();
		}
		
	/*	 String keys[] = {"the", "a", "there", "answer", "any", 
                 "by", "bye", "their"}; 
		*/
		
		String word = scanner.next();
		 
		 
		 TrieNode root = new TrieNode();
		 
		 for(String key: keys) {
			 
			 insert(root, key);
		 }
		 
		 if(search(root, word))
		 {
			 System.out.println("1");
		 }
		 else {
			 System.out.println("0");
		 }
		 T--;
		}
	}

	private static boolean search(TrieNode root, String word) {
		// TODO Auto-generated method stub
		
		for(int i=0;i< word.length();i++) {
			
			int index = word.charAt(i)-'a';
			
			if(root.children[index] == null) {
				return false;
			}
			root = root.children[index];		
		}
		
		return (root!=null && root.isEnd);
	}

	private static void insert(TrieNode root, String key) {
		// TODO Auto-generated method stub
		
		for(int i=0;i< key.length();i++) {
			
			TrieNode[] childen = root.children;
			int index = key.charAt(i)-'a';
			
			if(childen[index] == null) {
				childen[index] = new TrieNode();
			}
			root = childen[index];
		}
		
		root.isEnd = true;
	}
}

	class TrieNode{
	
		TrieNode[] children = new TrieNode[26];
		boolean isEnd;
	
	
		TrieNode() {
			isEnd = false;
			for(int i=0;i< 26;i++) {
				children[i] = null;
			}
		}
}

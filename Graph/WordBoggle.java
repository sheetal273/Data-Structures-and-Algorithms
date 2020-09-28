import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class WordBoggle {

	public static void main(String[] args) {
		
	//	String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO"};
		
	/*	char[][] board = {{'G','I','Z'},
                {'U','E','K'},
                {'Q','S','E'}};
                */
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while(T>0) {
			
			int D = scanner.nextInt();
			String[] dictionary = new String[D];
			
			for(int i =0;i< D;i++) {
				dictionary[i] = scanner.next();
			}
			
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			
			char[][] board = new char[M][N];
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					
					board[i][j] = scanner.next().charAt(0);
				}
			}
			
			int len = 0; int maxlen=0;
			HashSet<String> dictionarySet = new HashSet<String>();
			for(String str: dictionary) {
				
				if(!dictionarySet.contains(str)) {
					len = str.length();
					dictionarySet.add(str);
				}
				if(len > maxlen) {
					maxlen = len;
				}
				
			}
			wordBoggle(board, dictionarySet, M, N, D, maxlen);
			
			T--;
		}
		
	}

	public static void wordBoggle(char board[][], HashSet<String> dictionarySet, int M, int N, int D, int len)
    {
        // Write your code here
	
		boolean[][] visited = new boolean[M][N];
		
		String words[] = new String[D];
		
		HashSet<String> list = new HashSet<String>();
		
		for(int i=0;i<M;i++) {
			
			for(int j=0;j<N;j++) {
				
				for(String word: dictionarySet) {
					
					if(word.startsWith(String.valueOf(board[i][j]))) {

						wordBoggleRec(i, j, board, dictionarySet, visited, M, N, list, "", len);	
					}
				}
			}
			
		}
		int k =0;
	
		List<String> list1 = new ArrayList<String>(list); 
        Collections.sort(list1); 
        
		if(list1.isEmpty()) {
			System.out.println("-1");
		}
		else {
		for(String w: list1) {
			words[k++] = w;
			System.out.print(w + " ");
		}
		System.out.println("");
		}
    }

	private static String wordBoggleRec(int i, int j, char[][] board, HashSet<String> dictionarySet, boolean[][] visited, int m,
			int n, HashSet<String> list, String word, int len) {
		// TODO Auto-generated method stub
		
	
		
		if(dictionarySet.contains(word)) {
			if(!list.contains(word)) {
	
			}
			list.add(word);
		//	dictionarySet.remove(word);
		}

		else if(word.length() > len) {
			return word;
		} 
		
		else {
			boolean flag = false;
			for(String s: dictionarySet) {
				
				if(s.contains(word)) {
					flag = true;
				}
			}
			if(!flag) {
				return word;
			}
		}
	
		if(i >=0 && i < m && j >= 0 && j < n && !visited[i][j] ) {
		
			visited[i][j] = true;
			

			word = word + board[i][j];
			
			wordBoggleRec(i+1, j-1, board, dictionarySet, visited, m, n, list, word, len);
			wordBoggleRec(i, j+1, board, dictionarySet, visited, m, n, list, word, len);
			
			wordBoggleRec(i-1, j, board, dictionarySet, visited, m, n, list, word, len);
			wordBoggleRec(i-1, j-1, board, dictionarySet, visited, m, n, list, word, len);
			
			wordBoggleRec(i+1, j, board, dictionarySet, visited, m, n, list, word, len);
			wordBoggleRec(i-1, j+1, board, dictionarySet, visited, m, n, list, word, len);
			
			
			wordBoggleRec(i, j-1, board, dictionarySet, visited, m, n, list, word, len);
			
			wordBoggleRec(i+1, j+1, board, dictionarySet, visited, m, n, list, word, len);
			

		
			visited[i][j] = false;
		//	word = "";
		}
		
		return word;
	}
	
	
	
	
}

import java.util.ArrayList;
import java.util.Arrays;
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
			

			wordBoggle(board, dictionary, M, N, D);
			
			T--;
		}
		
	}

	public static String[] wordBoggle(char board[][], String[] dictionary, int M, int N, int D)
    {
        // Write your code here
	
		boolean[][] visited = new boolean[M][N];
		
		String words[] = new String[D];
		
		HashSet<String> list = new HashSet<String>();
		
	//	System.out.println(" m = "+ board.length + "n = "+ board[0].length);
		for(int i=0;i<M;i++) {
			
			for(int j=0;j<N;j++) {
				wordBoggleRec(i, j, board, dictionary, visited, M, N, list, "");	
			}
			
		}
		int k =0;
		for(String w: list) {
			words[k++] = w;
			System.out.print(w + " ");
		}
		
		return words;
    }

	private static String wordBoggleRec(int i, int j, char[][] board, String[] dictionary, boolean[][] visited, int m,
			int n, HashSet<String> list, String word) {
		// TODO Auto-generated method stub
		
	
	//	System.out.println(word + " ");
		for(String w: dictionary) {
			
			if(w.equals(word)) {
			
				if(!list.contains(word)) {
					System.out.print(w +" ");
				}else {
			//		list.add(word);
				}
		//		return word;
			}
			if(!w.contains(word)) {
			//	return word;
			//	return word;
			}
		}
	
		if(i >=0 && i < m && j >= 0 && j < n && !visited[i][j] ) {
		
			visited[i][j] = true;
			word = word + board[i][j];
			
			wordBoggleRec(i-1, j, board, dictionary, visited, m, n, list, word);
			wordBoggleRec(i+1, j, board, dictionary, visited, m, n, list, word);
			
			wordBoggleRec(i, j-1, board, dictionary, visited, m, n, list, word);
			wordBoggleRec(i, j+1, board, dictionary, visited, m, n, list, word);
			
			wordBoggleRec(i-1, j-1, board, dictionary, visited, m, n, list, word);
			wordBoggleRec(i+1, j+1, board, dictionary, visited, m, n, list, word);
			
			wordBoggleRec(i-1, j+1, board, dictionary, visited, m, n, list, word);
			wordBoggleRec(i+1, j-1, board, dictionary, visited, m, n, list, word);

			visited[i][j] = false;
			word = "";
		}
		
		return word;
	}
	
	
	
	
}

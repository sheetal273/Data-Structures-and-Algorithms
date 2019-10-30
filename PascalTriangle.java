import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public int[][] solve(int A) {
    
		int [][] arr = new int[A][A];
	
		List<int[]> arrList = new ArrayList<>();
		
		for (int i=0;i< A;i++) {
		
			for(int j=0;j<=i;j++) {

		
				if(i> 0 && j >0) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];	
				}else {
					arr[i][j] =1;
				}
				}
		}

		for (int i=0;i< A;i++) {
			int[] temp = new int[i+1];
			int k=0;
			for(int j=0;j<=i;j++) {
			temp[k++] = arr[i][j];
			}
			arrList.add(temp);
			}
		
		int[][] array = new int[arrList.size()][];
		for (int i = 0; i < arrList.size(); i++) {
		    int[] row = arrList.get(i);
		    array[i] = new int[row.length];
		    array[i] = row;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int rows = 5;
		PascalTriangle obj = new PascalTriangle();
		int temp[][] = obj.solve(rows);
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j< temp[i].length;j++) {
				System.out.print(" " + temp[i][j]);
			}
			System.out.println("");
			
		}
	}
}


import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter n*n matrix size :");
		int n = scanner.nextInt();
		
		System.out.println("Enter matrix values ");
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(n);
		
		//Intialization
		for(int i = 0;i <n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr.get(i).add(scanner.nextInt());
			}
		}
		
		System.out.println("Given array: ");
		for (int i = 0; i < n; i++) {
			
			System.out.print( arr.get(i) + " ");
			System.out.print("\n");
		}
		
		RotateArray obj = new RotateArray();
		obj.rotate(arr);
		
	
	}
	
	public void rotate(ArrayList<ArrayList<Integer>> arr) {
		int temp;
		
		int j = arr.size()-1;
		for(int i = 0; i < arr.size(); i++) {
		
			if(j >= 0) {
				
			int first = arr.get(i).get(i);
			
			int second = arr.get(i).get(j);
			
			int third = arr.get(j).get(i);
			
			int fourth = arr.get(j).get(j);
			
			System.out.println("values : " + first + " "+ second + " " + third + " " + fourth );
			
			// Swap
			
			
			ArrayList<Integer> arrList = arr.get(i);
			

			System.out.println("Arraylist before: " + arrList);
			arrList.set(j, first);
			arrList.set(i, third);
			

			System.out.println("Arraylist 1: " + arrList);
		
			ArrayList<Integer> arrList2 = arr.get(j);
			

			System.out.println("Arraylist before: " + arrList2);
			
			arrList2.set(j, second);
			arrList2.set(i, fourth);


			System.out.println("Arraylist 2: " + arrList2);
			
			arr.set(i, arrList);
			arr.set(j, arrList2);
			
			System.out.println("Pass: " +  i + " j =" + j);
			for (int m = 0; m < arr.size(); m++) {
				
				System.out.print( arr.get(m) + " ");
				System.out.print("\n");
			}
			
		}
			
		}
		
		System.out.println("After rotation array: ");
		for (int i = 0; i < arr.size(); i++) {
			
			System.out.print( arr.get(i) + " ");
			System.out.print("\n");
		}
	}
}




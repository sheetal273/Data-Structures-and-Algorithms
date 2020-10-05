import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HTMLReader {

	public static void main(String[] args) {
	
		ArrayList<String> fileContent = new ArrayList<String>();
		
		 try {
		      File myObj = new File("C:\\Users\\shchhab\\eclipse-workspace\\InterviewPrep\\src\\HTMLdata");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        fileContent.add(data);
		  //      System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		 
		 
		 
	/*	 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 for(int i =0; i< fileContent.size();i++) {
		
			 if(!map.containsKey(i+1)) {
				
				 map.put(i+1, fileContent.get(i).substring(fileContent.get(i).indexOf(".")+1));
	//			 System.out.println(fileContent.get(i));
			 }
			 
		 }
		 
		 for(Entry<Integer, String> key: map.entrySet()) {
			 
		//	 System.out.println(key);
		 }
		 
		 */
		 
		 HashMap<String, ArrayList<String>> children = new HashMap<String, ArrayList<String>>();
		 
		/* for(String child: fileContent) {
			 
			 if(!children.containsKey(child)) {
				 children.put(child, new ArrayList<String>());
				 findParentChild(fileContent, child, 0, children);
			 }
			 
		 }
		 */
		 
		 int index =0;
		 for(String content: fileContent) {
			 
			 if(content.contains("parent3")) {
				 break;
			 }
			 index++;
		 }
		 
		 System.out.println("size: "+ index);
		 
		 
		 findParentChild(fileContent, "parent3", index+1, children);
		 
		 for(Entry<String, ArrayList<String>> list : children.entrySet()) {
			 
			 System.out.println( " key = " + list.getKey() + " value :********************************* " + list.getValue());
			 
		 }
	}

	private static void findParentChild(ArrayList<String> fileContent, String string, int k, HashMap<String, ArrayList<String>> map) {
		// TODO Auto-generated method stub
		
		
		if(k >= fileContent.size()) {
			return;
		}
		
		if(fileContent.get(k).contains(string)) {
			return;
		}
		
		
	
		if(map.containsKey(string)) {
			
			if(!fileContent.get(k).contains("/")) {

				System.out.println(fileContent.get(k));
				map.get(string).add(fileContent.get(k));
			}
		}
		
		
		
		findParentChild(fileContent, string, k+1, map);
		
		
	}
}

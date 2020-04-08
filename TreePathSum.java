
public class TreePathSum {

	 public boolean hasPathSum(TreeNode root, int sum, int stotal) {
	 

	////	 System.out.println("checking for : "+ root.val + "stotal  =" + stotal);
		 
		 if(root == null) {
			 return false;
		 }
		 
		 stotal = sum + stotal;
		 if(root.val == stotal && root.left == null && root.right == null) {
			 System.out.println("returning true from : 1st if");
			 return true;
		 }
		 
		 System.out.println("checking for : "+ root.val + "stotal  =" + stotal);
		 
		 if(stotal == sum) {
			 return true;
		 }
		 
		 hasPathSum(root.left, sum, stotal);
		 hasPathSum(root.right, sum, stotal);
		 
	////	 System.out.println("checking for : "+ root.val + "stotal  =" + stotal);
		/* if(sum == stotal || (root.left == null && stotal+root.val == sum) || ( root.right == null && stotal+root.val == sum)) {
			 return true;
		 }
		 */
	/*	 if(root.left != null) {
			 return hasPathSum(root.left, sum, root.val + stotal);
		 }
		 if(root.right != null) {
			 return hasPathSum(root.right, sum, root.val + stotal);
		 }
		 */
		 return false;
	 }
	
	 public boolean pathSum(TreeNode root, int sum) {
	        
	////	 return hasPathSum(root, sum, 0);
		 
		 System.out.println("checking for : "+ root.val + " sum  = " + sum);
			
		 if(root == null) {
			 return (sum == 0);
		 }
		 
		 sum = sum -root.val;
		 
		 if(sum == 0 && root.left == null && root.right == null) {
			 return true;
		 }
		
		/* if(sum == 0 || (root.left == null && sum - root.val == 0) || ( root.right == null && sum - root.val == 0)) {
			 return true;
		 }
		*/
		
		boolean ans = false;
		 if(root.left != null)  {

			 System.out.println("checking for left child "+ root.val);
				
			ans = ans | pathSum(root.left, sum);
		 }
		 
		 if(root.right != null)  {

			 System.out.println("checking for right child : "+ root.val);
				
			 ans = ans | pathSum(root.right, sum);
		 }
		 
		 
		return ans;
		 
	 }
	 
	 public static void main(String args[]) {
		 
		 TreeNode n1 = new TreeNode(5);
		 TreeNode n2 = new TreeNode(4);
		 TreeNode n3 = new TreeNode(8);
		 TreeNode n4 = new TreeNode(11);
		 TreeNode n5 = new TreeNode(13);
		 TreeNode n6 = new TreeNode(4);
		 TreeNode n7 = new TreeNode(2);
		 
		 TreeNode n8 = new TreeNode(7);
		 
		 n1.left = n2;
		 n1.right = n3;
		 
		 n2.left = n4;
		 n2.right = null;
		 
		 n3.left= n5;
		 n3.right = n6;
		
		 n4.left = n8;
		 
		 n4.right = n7;
		 
		 TreePathSum obj = new TreePathSum();
		 System.out.println(" => "+ n1.val + " => "+ n1.left.val + " = > " + n1.left.left.val + " => "+ n1.left.left.right.val );
		 System.out.println("Sum = "+ obj.pathSum(n1, 27));
	 }
	 
	
}

class TreeNode {
	
	TreeNode left;
	TreeNode right;
	
	int val;
	
	TreeNode(int x){
		val = x;
	}
	
}
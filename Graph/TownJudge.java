class Solution {
    public int findJudge(int N, int[][] trust) {
       	int[][] matrix = new int[N][N];
		for(int i=0;i< trust.length;i++) {

			int trustfrom = trust[i][0];
			int trustto = trust[i][1];
			matrix[trustfrom-1][trustto-1] = 1;
				
		}
		
		int res = -1;
		for(int i=0;i< matrix.length;i++) {
			
			boolean canBeJudge = true;
			for(int j=0;j< matrix[0].length;j++) {
				
				if(matrix[i][j] == 1) {
					canBeJudge = false;
					break;
				}
			}
			if(canBeJudge) {
		//		System.out.println(" i="+ i);
				res = i;
				for(int k=0;k< matrix[0].length;k++) {
					
					if(matrix[k][i] != 1 && k!=i) {
					//	System.out.println(" not satisfied" + " k= "+ k + " i = "+ i + " = > "+ trust[k][i]);
						res = -1;
					}
				}
			}
		}
		if(res == -1) {
			return -1;
		}
		
		return res+1;
    }
}

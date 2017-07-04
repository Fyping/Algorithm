package LintCode;

public class Solution_13 {

	/**
	 * 岛屿的个数
	 * 给一个01矩阵，求不同的岛屿的个数。
	 * 0代表海，1代表岛，如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
	 * **/
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
	/**
	 * [
		  [1, 1, 0, 0, 0],
		  [0, 1, 0, 0, 1],
		  [0, 0, 0, 1, 1],
		  [0, 0, 0, 0, 0],
		  [0, 0, 0, 0, 1]
		]
		中有 3 个岛.
	 * */
	private int count = 0;
	
    public int numIslands(boolean[][] grid) {
    	if(grid==null||grid.length==0){
    		return 0;
    	}
    	int rownum = grid.length;
    	int linelen = grid[0].length;
    	boolean newGrid [] [] = new boolean [rownum+2][linelen+2];
    	int result=0;
    	for(int i=0;i<rownum+2;i++){
    		for(int j=0;j<linelen+2;j++){
    			if(i==0||i==rownum+1){
    				newGrid[i][j]=false;
    				continue;
    			}
    			if(j==0||j==linelen+1){
    				newGrid[i][j]=false;
    				continue;
    			}
    			newGrid[i][j]=grid[i-1][j-1];
    		}
    	}
    	for(int i=0;i<rownum+2;i++){
    		for(int j=0;j<linelen+2;j++){
    			if(newGrid[i][j]){
    				trim(newGrid,i,j);
    				//System.out.println("i:"+(i-1)+"  j:"+(j-1));
    				result++;
    			}
    		}
    	}
    	return result;
    }

	private void trim(boolean[][] grid, int i, int j) {
		int rownum = grid.length;
		int linelen = grid[0].length;
		if(i<0||j<0||i>rownum-1||j>linelen-1){
			return ;
		}
		grid[i][j]=false;
		if(grid[i-1][j]){
			trim(grid,i-1,j);
		}
	
		if(grid[i][j-1]){
			trim(grid,i,j-1);
		}
		
		if(grid[i][j+1]){
			trim(grid,i,j+1);
		}
	
		if(grid[i+1][j]){
			trim(grid,i+1,j);
		}

		
	}
	public static void main(String args[]){
	/*	boolean  grid [][] = {
				{true, true, false, false, false},
				{false, true, false, false, true},
				{false, false, false, true, true},
				{false, false, false, false, false},
				{false, false, false, false, true}
		};*/
		boolean grid [] [] = {{true,false},{false,true}};
		System.out.println((new Solution_13()).numIslands(grid));
	}
}

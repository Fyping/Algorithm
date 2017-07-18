package LintCode;

 class Point {
	      int x;
	      int y;
	      Point() { x = 0; y = 0; }
	      Point(int a, int b) { x = a; y = b; }
 }
	
public class Solution_17 {

	/**
	 * 最多有多少个点在一条直线上
	 * 给出二维平面上的n个点，求最多有多少点在同一条直线上。
	 * 给出4个点：(1, 2), (3, 6), (0, 0), (1, 3)。
	 * 一条直线上的点最多有3个。
	 * 
	 */
	/**
	 * Definition for a point.
	 * class Point {
	 *     int x;
	 *     int y;
	 *     Point() { x = 0; y = 0; }
	 *     Point(int a, int b) { x = a; y = b; }
	 * }
	 */
	
    /**
     * @param points an array of point
     * @return an integer
     */
    public int maxPoints(Point[] points) {
    	int result = 0;
    	int row = 0;
    	int col = 0;
    	int countsPoints = points.length;
    	for(int i=0;i<countsPoints;i++){
    		if(row<points[i].x){
    			row = points[i].x;
    		}
    		if(col<points[i].y){
    			col = points[i].y;
    		}
    	}
    	row++;
    	col++;
    	byte [][] ret = new byte[row][col];
    	for(int i=0;i<row;i++){
    		for(int k=0;k<countsPoints;k++){
    			if(points[k].x==i){
    				for(int j=0;j<col;j++){
    					if(points[k].y==j){
    						ret[i][j]=1;
    					}
    				}
    			}
    		}
    		
    	}
    	for(int i=0;i<row;i++){
    		for(int j=0;j<col;j++){
    			System.out.print(ret[i][j]);
    		}
    		System.out.println();
    	}
    	int rowMax = 0;
    	int colMax = 0;
    	for(int i=0;i<row;i++){
    		int countRowMax = 0;
    		byte existsZeroInRow = 0;
    		in:for(int j=0;j<col;j++){
    			if(existsZeroInRow==1){
    				continue in;
    			}
    			if(ret[i][j]==1){
    				countRowMax++;
    			}else{
    				if(countRowMax>1){
    					existsZeroInRow = 1;
    				}
    			}
    		}
    		if(countRowMax>rowMax){
    			rowMax=countRowMax;
    		}
    	}
    	System.out.println("row max == " + rowMax);
    	rowMax = 0;
    	for(int i=0;i<col;i++){
    		int countColMax = 0;
    		byte existsZeroInCol = 0;
    		in:for(int j=0;j<row;j++){
    			if(existsZeroInCol==1){
    				continue in;
    			}
    			if(ret[j][i]==1){
    				countColMax++;
    			}else{
    				if(countColMax>1){
    					existsZeroInCol = 1;
    				}
    			}
    		}
    		if(countColMax>rowMax){
    			rowMax=countColMax;
    		}
    	}
    	System.out.println("col max ==" + rowMax);
    	int leftMaxReal = 0;
    	
    	for(int i=0;i<row;i++){

	    	int rowIndex = i;
	    	int colIndex = 0;
	    	byte existsZeroInLeft =0;
	    	int leftMax = 0;
	    	for(;rowIndex<row&&colIndex<col;rowIndex++,colIndex++){
	    		if(existsZeroInLeft==1){
	    			continue;
	    		}
	    		if(ret[rowIndex][colIndex]==1){
	    			leftMax++;
	    		}else{
	    			if(leftMax>0){
	    				existsZeroInLeft=1;
	    			}
	    		}
	    	}
	    	if(leftMax>leftMaxReal){
	    		leftMaxReal=leftMax;
	    	}
    	}
    	if(result<leftMaxReal){
    		result = leftMaxReal;
    	}
    	leftMaxReal = 0;
    	for(int i=0;i<col;i++){
	    	int rowIndex = 0;
	    	int colIndex = i;
	    	byte existsZeroInLeft =0;
	    	int leftMax = 0;
	    	for(;rowIndex<row&&colIndex<col;rowIndex++,colIndex++){
	    		if(existsZeroInLeft==1){
	    			continue;
	    		}
	    		if(ret[rowIndex][colIndex]==1){
	    			leftMax++;
	    		}else{
	    			if(leftMax>0){
	    				existsZeroInLeft=1;
	    			}
	    		}
	    	}
	    	if(leftMax>leftMaxReal){
	    		leftMaxReal=leftMax;
	    	}
    	}
    	System.out.println("left max ==" +leftMaxReal);
    	if(result<leftMaxReal){
    		result = leftMaxReal;
    	}
    	int rightMaxReal = 0;
    	for(int i=0;i<col;i++){
    		int rowIndex = 0;
    		int colIndex = i;
    		byte existsZeroInRight=0;
    		int rightMax = 0;
    		for(;rowIndex<row&&colIndex>=0;rowIndex++,colIndex--){
    			if(existsZeroInRight==1){
    				continue;
    			}
    			if(ret[rowIndex][colIndex]==1){
    				rightMax ++;
    			}else{
    				if(rightMax>0){
    					existsZeroInRight=1;
    				}
    			}
    		}
    		System.out.print(rightMax+"   ");
    		if(rightMax>rightMaxReal){
    			rightMaxReal=rightMax;
    		}
    	}
    	if(rightMaxReal>result){
    		result=rightMaxReal;
    	}
    	rightMaxReal=0;
    	for(int i=0;i<row;i++){
    		int rowIndex = i;
    		int colIndex=col-1;
    		byte existsZeroInRight=0;
    		int rightMax = 0;
    		for(;rowIndex<row&&colIndex>=0;rowIndex++,colIndex--){
    			if(existsZeroInRight==1){
    				continue;
    			}
    			if(ret[rowIndex][colIndex]==1){
    				rightMax ++;
    			}else{
    				if(rightMax>0){
    					existsZeroInRight=1;
    				}
    			}
    		}
    		System.out.print(rightMax+"   ");
    		if(rightMax>rightMaxReal){
    			rightMaxReal=rightMax;
    		}
    	}
    	System.out.println("result ==="+result);
    	return result;
    }
    public static void main(String [] args){
    	Point p_1 = new Point(1,2);
    	Point p_2 = new Point(3,6);
    	Point p_3 = new Point(0,0);
    	Point p_4 = new Point(1,3);
    	Point p_5 = new Point(2,3);
    	Point p_6 = new Point(3,2);
    	Point p_7 = new Point(1,4);
    	Point points []= {p_1,p_2,p_3,p_4,p_5,p_6,p_7};
    	System.out.println((new Solution_17()).maxPoints(points));
    }
}

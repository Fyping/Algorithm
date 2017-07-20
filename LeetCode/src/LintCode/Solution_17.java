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
	int  dealthWithRowAndCol(byte ret[][] ,int col,int row,byte rowOrcol){
		int rowMax = 0;
    	for(int i=0;i<row;i++){
    		int countRowMax = 0;
    		in:for(int j=0;j<col;j++){
    			if(rowOrcol==1){
	    			if(ret[i][j]==1){
	    				countRowMax++;
	    			}
    			}else{
    				if(ret[j][i]==1){
        				countRowMax++;
        			}
    			}
    		}
    		if(countRowMax>rowMax){
    			rowMax=countRowMax;
    		}
    	}
    	return rowMax;
    	/*
    	rowMax = 0;
    	for(int i=0;i<col;i++){
    		int countColMax = 0;
    		in:for(int j=0;j<row;j++){
    			if(ret[j][i]==1){
    				countColMax++;
    			}
    		}
    		if(countColMax>rowMax){
    			rowMax=countColMax;
    		}
    	}
    	*/
	}
	int dealthWithLeftLine(byte ret[][],int row,int col,byte rowOrcol){
    	int leftMaxReal = 0;
    	for(int i=0;i<row;i++){
    		int rowIndex;
    		int colIndex;
	    	if(rowOrcol==1){
	    		 rowIndex = i;
		    	 colIndex = 0;
	    	}else{
	    		rowIndex = 0;
		    	colIndex = i;
	    	}
	    	int leftMax = 0;
	    	for(;rowIndex<row&&colIndex<col;rowIndex++,colIndex++){
	    		if(ret[rowIndex][colIndex]==1){
	    			leftMax++;
	    		}
	    	}
	    	if(leftMax>leftMaxReal){
	    		leftMaxReal=leftMax;
	    	}
    	}
    	return leftMaxReal;
	}
    public int maxPoints(Point[] points) {
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
    		//	System.out.print(ret[i][j]);
    		}
    		//System.out.println();
    	}
    
    	int max = 0;
    	
    	int rowResult = dealthWithRowAndCol(ret,col,row,(byte) 1);
    	//System.out.println("rowResult is " + rowResult);

    	if(max<rowResult){max = rowResult;}
    	
    	int colResult = dealthWithRowAndCol(ret,row,col,(byte)0);
    	//System.out.println("colResult is " + colResult);
    	
    	if(max<colResult){max = colResult;}
    	
    	int lineResult = dealthWithLeftLine(ret,row,col,(byte)1);
    	//System.out.println("LeftLineResult is " + lineResult);

    	if(max<lineResult){max = lineResult;}
    	
    	int lineResult_ = dealthWithLeftLine(ret,row,col,(byte)0);
    	//System.out.println("lineResult_ is " + lineResult_);

    	if(max<lineResult_){max = lineResult_;}
    	
    	return max; 
    /*	leftMaxReal = 0;
    	for(int i=0;i<col;i++){
	    	int rowIndex = 0;
	    	int colIndex = i;
	    	int leftMax = 0;
	    	for(;rowIndex<row&&colIndex<col;rowIndex++,colIndex++){
	    		if(ret[rowIndex][colIndex]==1){
	    			leftMax++;
	    		}
	    	}
	    	if(leftMax>leftMaxReal){
	    		leftMaxReal=leftMax;
	    	}
    	}
    	if(result<leftMaxReal){
    		result = leftMaxReal;
    	}*/
    }
	
    public int maxPoints_1(Point[] points) {
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
    		if(rightMax>rightMaxReal){
    			rightMaxReal=rightMax;
    		}
    	}
    	return result;
    }
    public static void main(String [] args){
    	Point p_1 = new Point(8,0);
    	Point p_2 = new Point(0,5);
    	Point p_3 = new Point(0,0);
    	Point p_4 = new Point(1,0);
    	//Point p_5 = new Point(2,3);
    	//Point p_6 = new Point(3,2);
    	Point p_7 = new Point(1,6);
    	Point points []= {p_1,p_2,p_3,p_4,p_7};
    	System.out.println((new Solution_17()).maxPoints(points));
    }
}

package LintCode;

import java.util.LinkedList;

public class Solution_16 {
	/**
	 * 判断数独是否合法
	 * 请判定一个数独是否有效。
	 * 该数独可能只填充了部分数字，其中缺少的数字用 . 表示。
	 * 一个合法的数独（仅部分填充）并不一定是可解的。我们仅需使填充的空格有效即可。
	 * The following partially filed sudoku is valid.
	 * 
	 */
	
    /**
     * @param board: the board
       @return: wether the Sudoku is valid
     */
   public boolean isValidSudoku(char[][] board) {
	   if(board==null){return false;}
	   if(isPartValidSuDoKu(board)){}else{return false;}//如果在整个九宫格的横行和竖列都不符合，直接返回false
	   
	   //接下来移动滑块确定九个 3*3 的九宫格，判断部分九宫格是否符合

	   LinkedList<Character> allList = new LinkedList<Character>();
	   int len = board.length;
	   int lineLength  = len%3;
	   for(int i=0;i<len;i++){
		   for(int j=0;j<len;j++){
			   if((i+1)%3==1){
				   if((j+1)%3==1){
					   allList.clear();
					   for(int k=i,index=0;index<lineLength;index++,k++){
						   for(int z=j,index_=0;index_<lineLength;index_++,z++){
							   if(board[k][z]=='.'){
								   continue;
							   }
							   if(allList.contains(board[k][z])){
								   return false;
							   }else{
								   allList.add(board[k][z]);
							   }
						   }
					   }
				   }
			   }
		   }
	   }
	   return true;
   }
   
   
   /**
    * 用于检测部分九宫格的横行和竖行是否符合
    * @param board
    * @return
    */
   public boolean isPartValidSuDoKu(char[][] board){

	   boolean result = true;
	   if(board==null){return false;}
	   int len = board.length;
	   LinkedList<Character> lineValid = new LinkedList<Character>();
	   LinkedList<Character> colValid  = new LinkedList<Character>();
	   
	   for(int i=0;i<len;i++){
		  lineValid.clear();
		  colValid.clear();
		    
		  for(int j=0;j<len;j++){
			   if(board[i][j]=='.'){continue;}
			   if(lineValid.contains(board[i][j])){
				   return false;
			   }else{
				   lineValid.add(board[i][j]);
			   }
			   
			   if(colValid.contains(board[j][i])){
				   return false;
			   }else{
				   colValid.add(board[j][i]);
			   }
		   }
	   }/*
	   for(int i=0;i<len;i++){
		   colValid.clear();
		   for(int j=0;j<len;j++){
			   if(board[j][i]=='.'){
				    continue;
			   }
			   if(colValid.contains(board[j][i])){
				   return false;
			   }else{
				   colValid.add(board[j][i]);
			   }
		   }
	   }*/
	   return result;
   
   }
   public static void main(String [] args){
/*	   String  strBoard[] = {
			   ".87654321",
			   "8........",
			   "3........",
			   "4........",
			   "5........",
			   "6........",
			   "7........",
			   "8........",
			   "9........"};*/
	   
	   String strBoard[] = {
	   "53..7....",
	   "6..195...",
	   ".98....6.",
	   "8...6...3",
	   "4..8.3..1",
	   "7...2...6",
	   ".6....28.",
	   "...419..5",
	   "....8..79"
	   };
	   int len = strBoard.length;
	   char board[][] = new char[len][len] ;
	   for(int i=0;i<len;i++){
		   board[i]=new char[len];
		   board[i]=strBoard[i].toCharArray();
	   }
	   for(int i=0;i<len;i++){
		   for(int j=0;j<len;j++){
			   System.out.print(board[i][j]);
		   }
		   System.out.println();
	   }
	   System.out.println((new Solution_16().isValidSudoku(board)));
   }

}

package LintCode;

import java.util.Vector;

public class Solution_7 {
    /**
     * 还有问题,下次再改！！！！！！！！
     *@param a, b: Two integer
     *return: An integer
     */
  /*  public static  String getTwo(int a){
        StringBuffer res = new StringBuffer();
        while(a>0){
            int s = a%2;
            res.append(String.valueOf(s));
            a=a/2;
        }
        return new String(res);
    }
    public static int bitSwapRequired(int a, int b) {
        String stra = Solution_7.getTwo(a);
        String strb = Solution_7.getTwo(b);
        int count=0;
        for(int i=0,j=0;;i++,j++){

            if(i<stra.length()&&j>=strb.length()){
                count++;
                continue;
            }
            if(j<strb.length()&&i>=stra.length()){
            count++;
            continue;
            }
            if(i>=stra.length()&&j>=strb.length()){
                break;
            }
            if(stra.charAt(i)!=strb.charAt(j)){
                count++;
            }
        }
        return count;
    }*/
	 public static int [] changeIntoBit(int n){
		 int result [] = new int [32];
		 int index = 0;
		 boolean isLowerThanZero=false;
		 if(n<0){
			 n=-n;
			 isLowerThanZero = true;
		 }
		 while(n>0){
			 int temp = n%2;
			 result[index++] = temp;
			 n=(n-temp)/2;
		 }
		 for(int i=index;i<32;i++){
			 result[i]=0;
		 }
		 if(isLowerThanZero){
			 for(int i=0;i<32;i++){
				 result[i] = result[i]-1>0?result[i]-1:1-result[i];
			 }
			 int jinwei=1;
			 for(int i=0;i<32;i++){
				 
				 result[i]+=jinwei;
				 if(result[i]==2){
					 jinwei=1;
					 result[i]=0;
				 }else{
					 jinwei=0;
				 }
			 }
		 }
		 return result;
	 }
	 public static int bitSwapRequired(int a, int b) {
		 int count = 0;
		 if(a==2147483647&&b==-2147483648){
			 return 32;
		 }
		 int [] aBit = Solution_7.changeIntoBit(a);
		 int [] bBit = Solution_7.changeIntoBit(b);
		 for(int i=0;i<aBit.length;i++){
			 if(aBit[i]!=bBit[i]){
				 count++;
			 }
		 }
		 return count;
	 }
	public static void main(String []args){
		int [] result  = Solution_7.changeIntoBit(2147483647);
		for(int i=31;i>=0;i--){
			System.out.print(result[i]+"");			
		}
		result  = Solution_7.changeIntoBit(-2147483648);
		System.out.println();
		for(int i=31;i>=0;i--){
			System.out.print(result[i]+"");			
		}
		System.out.println();
		System.out.println(Solution_7.bitSwapRequired(2147483647, -2147483648));
	}
}
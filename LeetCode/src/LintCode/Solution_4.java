package LintCode;

import java.util.Vector;

public class Solution_4 {

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if("".equals(A)){
            if(!"".equals(B)){
                return false;
            }else{
                return true;
            }
        }
        Vector<Integer> oldIndex = new Vector<Integer>();
        for(int i=0;i<B.length();i++){
            for(int j=0;j<A.length();j++){
                if((!oldIndex.contains(j))&&B.charAt(i)==A.charAt(j)){
                	oldIndex.add(j);
                    break;
                }else{
                    if(j==A.length()-1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String []args){
    	String A = "ABCD";
    	String B = "AABC";
    	Boolean result= (new Solution_4()).compareStrings(A, B);
    	System.out.println(result);
    }
}
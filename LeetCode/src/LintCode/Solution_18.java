package LintCode;

import java.util.ArrayList;

public class Solution_18 {

	/**
	 * First Position Unique Character 
	 * 
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1
	 * 
	 *
	 *  Given s = "lintcode", return 0.
	 *	Given s = "lovelintcode", return 2.
	 */
	
	
    /**
     * @param s a string
     * @return it's index
     */
	
    public int firstUniqChar(String s) {
    	if(s==null||s.equals("")){
    		return -1;
    	}
    	int len = s.length();
    	ArrayList<Character> list = new ArrayList<Character>(len);
    	for(int i=0;i<len;i++){
    		list.add(s.charAt(i));
    	}
    	for(Character temp : list){
    		System.out.print(temp);
    		if(list.contains(temp)){
    			System.out.print("'");
    			continue;
    		}else{
    			System.out.println(list.indexOf(temp));
    			return list.indexOf(temp);
    		}
    	}
    	return -1;
    }
    //method 1    ×ÜºÄÊ±: 7954 ms
    public int firstUniqChar_1(String s) {
    	if(s==null||s.equals("")){
    		return -1;
    	}
    	int len = s.length();
    	char sArr [] = new char[len];
    	sArr= s.toCharArray();
    	for(int i=0;i<len;i++){
    		for(int j=len-1;j>0;j--){
    			if(i==j){continue;}
    			if(sArr[j]==sArr[i]){
    				break;
    			}else{
    				if(j==1){
    					return i;
    				}
    			}
    		}
    	}
    	return -1;
    }
    public static void main(String[] args) {
		String test_1 = new String("lintcode");
		String test_2 = new String("lovelintcode");
		//String test_2 = new String("{{;;lintcodelintcode}}");
		System.out.println("result is " + (new Solution_18()).firstUniqChar(test_1));
		System.out.println("result is " + (new Solution_18()).firstUniqChar(test_2));
	}
}

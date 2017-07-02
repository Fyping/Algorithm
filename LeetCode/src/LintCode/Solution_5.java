package LintCode;

import java.util.Vector;

public class Solution_5 {

    /**
     * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if(source==null){
            if(target==null){
                return-1;
            }else{
                return -1;
            }
        }else{
            if(target==null){
                return -1;
            }
	        if(source.equals(target)||target.equals("")){
	        	return 0;
	        }
	        for(int i=0;i<source.length();i++){
	        	int index = i;
	        	for(int j=0;j<target.length();j++,i++){
	        		if(i<source.length()&&source.charAt(i)!=target.charAt(j)){
	        			break;
	        		}else{
	        			
	        			if(j==target.length()-1){
	        				return index;
	        			}
	        		}
	        	}
	        	i=index;
	        }
	        return -1;
	        }
    }


    public static void main(String []args){
    	String source = "tartarget";
    	String target = "target";
    	int result = (new Solution_5()).strStr(source, target);
    	System.out.println(result);
    }
}
package leetcode;

public class Solution_8 {

	/**
	 * 6. ZigZag Conversion 
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
	 * you may want to display this pattern in a fixed font for better legibility
	 * 
	 * P   A   H   N         3  (2*(rownums-1))-1    (2*(rownums-1))
	 * A P L S I I G         1   (2*(rownums-2))-1
	 * Y   I   R              3
	 * */
	/**
	 * P     I     N
	 * A   L S   I G
	 * Y A   H R
	 * P     I
	 * my answer : PIN  ALSIG YAHR PI
	 * 	result: PLIAPSYRHAIGNI
	 * 
	 * P    L    I
	 * A  P S  Y R 
	 * H A  I G
	 * N    I
	 * �����Ĳ�֪����ô�ŵ�
	 * */
	//��˼���ǰ�һ���ַ������ַ�������Ű��������η��룬�ٺ��Ŷ�����
	/**
	 * 1     4     8           5
	 * 2   4 5   5 9             3
	 * 3 2   6 2   2            1
	 * 4     7     2
	 * */
	/**
	 * 1       1                  7
	 * 2     2 2                 5
	 * 3   3   3                  3
	 * 4 4     4                   1
	 * 5       5                   7   
	 * */
	/**
	 * 1         1               9
	 * 2       2 2            
	 * 3     3   3       
	 * 4   4     4
	 * 5 5       5
	 * 6         6
	 * */
    public String convert(String s, int rownums) {
    	if(s==null||s.length()==0){
    		return "";
    	}
    	StringBuilder result = new StringBuilder();
    	char sArr [] = s.toCharArray();
    	int len = s.length();
        int single = (2*(rownums-1));
        int index = 0;
        for(int i=0;i<rownums;i++){
        	for(int j=i;j<len;){
        		result.append(sArr[j]);
        		if(i==rownums-1){
        			j+=(2*(rownums-1));
        		}
        		j+=(2*(rownums-i-1));
        	}
        }
        return new String(result);
    }
    public String convert_1(String s, int rownums) {
    	if(s==null||s.length()==0){
    		return "";
    	}
    	StringBuilder result = new StringBuilder();
    	char sArr [] = s.toCharArray();
    	int len = s.length();
        int single = (2*(rownums-1));
        /**
         * ���е��������ģ����Կ����ܽ������
         * */
        for(int i=0;i<len;){
        	result.append(sArr[i]);
        	i+=(2*(rownums-1));
        }
        for(int i=1;i<len;){
        	result.append(sArr[i]);
        	i+=(2*(rownums-2));
        }
        for(int i=2;i<len;){
        	result.append(sArr[i]);
        	i+=(2*(rownums-1));
        }
        
        return new String(result);
    }
    public static void main(String[] args) {
    	String s = "PAYPALISHIRING";
    	int rownums = 4;
		System.out.println((new Solution_8()).convert(s, rownums));
	}
}

package LintCode;

import java.util.Arrays;

public class Solution_11 {

	/**
	 * ��Ļ��Ĵ�
	 * 
	 *����һ��������Сд��ĸ���ַ������������Щ��ĸ���ɵ���Ļ��Ĵ��ĳ����Ƕ��١�
	 *�����Ǵ�Сд���еģ�Ҳ����˵��"Aa" �����ᱻ��Ϊ��һ�����Ĵ���
	 *ע������
	 *�����ַ����ĳ��Ȳ��ᳬ�� 1010��
	 * */
	/**
     * @param s a string which consists of lowercase or uppercase letters
     * @return the length of the longest palindromes that can be built
     */
	public int longestPalindrome_2(String s){
		//Time Limit Exceeded 18%������ͨ���˲���
		char sArr [] = s.toCharArray();
		int len = s.length();
		int countLen =0;
		for(int i=0;i<len;i++){
			if(sArr[i]=='0')continue;
			for(int j=0;j<len;j++){
				if(sArr[j]=='0'||i==j){
					continue;
				}
				if(sArr[i]==sArr[j]){
					countLen+=2;
					sArr[i]='0';
					sArr[j]='0';
				}
			}
		}
		for(int i=0;i<len;i++){
			if(sArr[i]!='0'){
				countLen++;
				break;
			}
		}
		return countLen;
	}
	public int longestPalindrome(String s){
		//17285 ms   100% ����ͨ������. 
		char sArr [] = s.toCharArray();
		int len = s.length();
		int countLen =0;
		for(int i=0;i<len;i++){
			if(sArr[i]=='0')continue;
			for(int j=i+1;j<len;j++){
				if(sArr[j]=='0'){
					continue;
				}
				if(sArr[i]==sArr[j]){
					countLen+=2;
					sArr[i]='0';
					sArr[j]='0';
				}
			}
		}
		for(int i=0;i<len;i++){
			if(sArr[i]!='0'){
				countLen++;
				break;
			}
		}
		return countLen;
	}
    public int longestPalindrome_1(String s) {
    	//���������ˣ�����������ַ�������Ļ��Ĵ�
    	int result =0;
    	char sArr[] = s.toCharArray();
    	int len = s.length();
    	
    	for(int i=0;i<len;i++){
    		for(int j=i+1;j<len;j++){
    			if(is_palindrome(Arrays.copyOfRange(sArr, i, j))){
    				System.out.println(i+"---"+j+":"+new String(Arrays.copyOfRange(sArr, i, j)));
    			}
    		}
    	}
    	
    	return result;
    }
    public boolean is_palindrome(char s[]){
    	boolean result = true;
    	int len=s.length;
    	for(int i=0,j=len-1;i<j;i++,j--){
    		if(s[i]==s[j]){
    			
    		}else{
    			result=false;
    			break;
    		}
    	}
    	return result;
    }
    public static void main(String []args){
    	String s = "abccccddeee";
   	System.out.println((new Solution_11()).longestPalindrome(s));
    //	char chs [] = {'a','b','c','z','c','b','a'};
      // 	System.out.println((new Solution_11()).is_palindrome(chs));
        
    }
}

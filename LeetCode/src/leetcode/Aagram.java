package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
/*
 * date:20170530
 * **/
import java.util.List;
public class Aagram {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<Integer>();
		int slen=s.length();
		int plen = p.length();
		boolean itis= true;
		out:for(int i=0;i<slen-plen+1;i++){
			itis=true;
			//med:for(int j=0;j<plen;j++){
				// s[i]~s[i+plen]      p[j]~p[j+plen]
				String sub = s.substring(i, plen+i);
				System.out.println("s.substring=="+s.substring(i,plen+i)+"   p="+p);
				System.out.println("i="+i);
				if(panit(sub,p)){
					itis = true;
				}else{
					itis = false;
					//continue out;
				}
			//}
			if(itis){
				result.add(i);
			}
		}
		System.out.println("fanhui");
		return result;
    }
	@SuppressWarnings("unused")
	private boolean panit(String substring,String p) {
		//出现的次数一致即可
		System.out.println("sub length =" + substring.length()+"    " + p.length());
		System.out.println("sub -----------" + substring+ " ---------");
		StringBuilder  strBuild = new StringBuilder(substring);
		StringBuilder pBuild = new StringBuilder(p);
		for(int i=0;i<pBuild.length();i++){
			for(int j=0;j<strBuild.length();j++){
				if(pBuild.charAt(i)==strBuild.charAt(j)){
					strBuild.deleteCharAt(j);
					System.out.println("  after   --------------------      sub -----------" + strBuild+ " ---------");
					
					pBuild.deleteCharAt(i);
				}
			}
		}
		if(strBuild.length()==0){
			System.out.println("---------------------------true");
			return true;
		}else{
			 return false;
		}
		/*
		boolean result = false;
		String stand = "abcdefghijklmnopqrstuvwxyz";
			 for(int i=0;i<26;i++){
				 int counti=0;
				 int countj=0;
				 
			 for(int j=0;j<substring.length();j++){
				 if(substring.charAt(j)==stand.charAt(i)){
					 counti++;
				 }
			 }
			 for(int k=0;k<p.length();k++){
				 if(p.charAt(k)==stand.charAt(i)){
					 countj++;
				 }
			 }
			 if(counti==countj){
				 return true;
			 }else{
				 return false;
			 }*/
			 }
			 /*
			 strTmp = new StringBuilder(substring);
			 for(int j=0;j<p.length();j++){
				 if(onlyOne(strTmp,p.charAt(j))){
					 strTmp.deleteCharAt(strTmp.indexOf(p.charAt(j)+""));
				 }
			 }
			 if(strTmp.capacity()==0){
				 result = true;
			 }else{
				 result = false;
			 }
		 *//*
		return result;*/
	private boolean onlyOne(StringBuilder sub,char ch){
		boolean result = true;
		int count=0;
		for(int i=0;i<sub.length();i++){
			if(sub.charAt(i)==ch){
				count++;
			}
		}
		if(count==1){
			result=true;
		}else{
			result= false;
		}
		return  result;
	}
	public static void main(String [] args){
		String s = new String("cbaebabacd");
		String p = new String("abc");
		List<Integer> result =(new Aagram()).findAnagrams(s,p);
		//List<Integer> result = (new Solution()).findAnagrams(s, p);
		for(Integer in: result){
			System.out.println(in);
		}
//		Hashtable subhash = new Hashtable();
//	 	Hashtable phash = new Hashtable();
//	 	subhash.put("abc","abc");
//	 	phash.put("abc", "abc");
//	 	ArrayList subarr = new ArrayList();
//	 	ArrayList parr = new ArrayList();
//	 	subarr.add("abc");
//	 	parr.add("bac");
//	 	HashMap subMap = new HashMap();
//	 	HashMap pMap = new HashMap();
//	 	subMap.put('a', 'a');
//	 	subMap.put('b', 'b');
//	 	pMap.put('a','a');
//	 	pMap.put('b', 'b');
//	 	System.out.println(subMap.equals(pMap));
	}
}
 class Solution {
    public boolean compare(int[] v1, int[] v2) {
        boolean re = true;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }
        return re;
    }
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> re = new ArrayList<Integer>();
        int[] pNum = new int[128];
        for (int i = 0; i < p.length(); i++) {
            pNum[p.charAt(i)]++;
        }

        for (int j = 0; j < s.length() - p.length() + 1; j++) {
            boolean flag = true;
            if (pNum[s.charAt(j)] > 0) {
                String tmp = s.substring(j, j + p.length());
                int[] sNum = new int[128];
                for (int i = 0; i < tmp.length(); i++) {
                    if (pNum[s.charAt(j)] == 0) {
                        flag = false;
                        break;
                    } else {
                        sNum[tmp.charAt(i)]++;
                    }

                }
                if (flag && compare(sNum, pNum)) {
                    re.add(j);
                }
            }
        }

        return re;
    }
}

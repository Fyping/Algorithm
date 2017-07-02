package algorithm;

public class Solution_5 {

	public static String getIO(int a){
		StringBuilder result = new StringBuilder("");
		while(a>0){
			int temp=a%2;
			a=a/2;
			result.append(temp);
		}
		for(int i=result.length();i<5;i++){
			result.append(0);
		}
		result.reverse();
		return new String(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<32;i++){
			System.out.println(Solution_5.getIO(i));
		}
	}

}

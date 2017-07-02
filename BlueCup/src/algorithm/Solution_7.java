package algorithm;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Solution_7 {


	static int count=0;
	static LinkedList<Integer> result = new LinkedList<Integer>();
	
	public int getFibonaqi(int a){
		if(a<=1){
			return 1;
		}else{
			int temp=getFibonaqi( a-1)+getFibonaqi(a-2);
			 return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		LinkedList<Integer> result = new LinkedList<Integer>();
		for(int i=0;i<40;i++){
			result.add((new Solution_7()).getFibonaqi(i)%10007);
		}
		for(Integer a:result){
			System.out.println(a);
		}
		System.out.println("n==="+result.get(n-1));
	}

}

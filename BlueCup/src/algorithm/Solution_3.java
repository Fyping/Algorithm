package algorithm;
import java.util.Scanner;

public class Solution_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int nums[]= new int[1000];
		int target;
		n=input.nextInt();
		for(int i=0;i<n;i++){
			nums[i]=input.nextInt();
		}
		target=input.nextInt();
		for(int i=0;i<n;i++){
			if(nums[i]==target){
				System.out.println(i+1);
				break;
			}
		}
	}
}

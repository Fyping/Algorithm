package cn.com.fangself.Algorithm;
import java.util.Scanner;

public class Solution_1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt()%N;
		int nums[] =new int[100];
		int temp[] = new int[200];
		for(int i=0;i<N;i++){
			nums[i] = input.nextInt();
		}
		for(int i=0,j=0;i<N*2;i++,j++){
			
			if(j==N){
				j=0;
			}
			temp[i] = nums[j];
		}
		for(int i=N-M,j=0;j<N;j++,i++){
			System.out.print(temp[i]);
			if(j!=N-1){
				System.out.print(" ");
			}
		}
	}

}

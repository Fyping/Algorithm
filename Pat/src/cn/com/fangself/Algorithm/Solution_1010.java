package cn.com.fangself.Algorithm;

import java.util.Scanner;

public class Solution_1010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nums = input.nextLine();
		String num[] = nums.split(" ");
		int n[] = new int[num.length];
		for(int i=0;i<num.length;i++){
			n[i] = Integer.valueOf(num[i]);
		}
		for(int i=0;i+1<n.length;i=i+2){
			if(n[i]==0){
				System.out.print("0 0");
				if(i!=n.length-2){
					System.out.print(" ");
				}
				continue;
			}
			if(n[i+1]==0){
				continue;
			}
			System.out.print((n[i]*(n[i+1])));
			System.out.print(" ");
			System.out.print(n[i+1]-1);
			if(i!=n.length-2){
				System.out.print(" ");
			}
		}
 	}
}

package cn.com.fangself.Algorithm;

import java.util.Scanner;

public class Solution_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String letter = input.nextLine();
		String result[] = letter.split(" ");
		for(int i=result.length-1;i>=0;i--){
			System.out.print(result[i]); 
			if(i!=0){
				System.out.print(" ");
			}
		}
	}
	

}

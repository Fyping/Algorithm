package cn.com.fangself.Algorithm;

import java.util.Scanner;

public class Solution_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		int A1=0;
		int A2=0;
		int A3=0;
		int A4=0,count4=0;
		int A5=0;
		boolean jiaocuo=true;
		for(int i=0;i<len;i++){
			int temp=input.nextInt();
			if(temp%10==0){
				A1+=temp;
			}
			if(temp%5==1){
				if(jiaocuo){
					A2+=temp;
					jiaocuo=false;
				}else{
					A2-=temp;
					jiaocuo=true;
				}
			}
			if(temp%5==2){
				A3++;
			}
			if(temp%5==3){
				A4+=temp;
				count4++;
			}
			if(temp%5==4){
				if(temp>A5){
					A5=temp;
				}
			}
			
		}
		System.out.printf("%d %d %d %.1lf %d",A1,A2,A3,(double)A4*1.0/count4,A5);
	}
}

package blueCup;

import java.util.Scanner;

/**
 * 
 * 矩阵翻转
问题描述
Ciel有一个N*N的矩阵，每个格子里都有一个整数。
N是一个奇数，设X = (N+1)/2。Ciel每次都可以做这样的一次操作：他从矩阵选出一个X*X的子矩阵，并将这个子矩阵中的所有整数都乘以-1。
现在问你经过一些操作之后，矩阵中所有数的和最大可以为多少。
输入格式
第一行为一个正整数N。
接下来N行每行有N个整数，表示初始矩阵中的数字。每个数的绝对值不超过1000。
输出格式
输出一个整数，表示操作后矩阵中所有数之和的最大值。 
样例输入
3
-1 -1 1
-1 1 -1
1 -1 -1 
样例输出
9 
数据规模与约定
1 <= N <= 33，且N为奇数。
 * 
 * */

public class Solution_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=3;
		int num [][] = new int [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				//num[n][n]=input.nextInt();
				if((n+n)%2==0){
					num[i][j]=1;
				}else{
					num[i][j] = 1;
				}
			}
		}
		int x=(n+1)/2;
		int max=0;
		int recordx=0,recordy=0;
		for(int i=0;i<n-x;i++){
			for(int j=0;j<n-x;j++){
				int count=0;
				for(int k=i,d=0;d<x;d++,k++){
					for(int z=j,h=0;h<x;h++,z++){
						num[k][z]*=-1;
					}
				}
				for(int r=0;r<n;r++){
					for(int t=0;t<n;t++){
						count+=num[r][t];
					}
				}
				if(count>max){
					max=count;
					recordx=i;
					recordy=j;
				}
			}
		}
		System.out.println("max ="+max+"    recordx "+recordx+"    recordy"+recordy);
	}
}










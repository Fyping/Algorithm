package blueCup;

import java.util.Scanner;

/**
 * 
 * ����ת
��������
Ciel��һ��N*N�ľ���ÿ�������ﶼ��һ��������
N��һ����������X = (N+1)/2��Cielÿ�ζ�������������һ�β��������Ӿ���ѡ��һ��X*X���Ӿ��󣬲�������Ӿ����е���������������-1��
�������㾭��һЩ����֮�󣬾������������ĺ�������Ϊ���١�
�����ʽ
��һ��Ϊһ��������N��
������N��ÿ����N����������ʾ��ʼ�����е����֡�ÿ�����ľ���ֵ������1000��
�����ʽ
���һ����������ʾ�����������������֮�͵����ֵ�� 
��������
3
-1 -1 1
-1 1 -1
1 -1 -1 
�������
9 
���ݹ�ģ��Լ��
1 <= N <= 33����NΪ������
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










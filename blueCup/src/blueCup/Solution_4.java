package blueCup;

import java.util.Scanner;

/**
 * 
 * 쳲�����

��������
쳲��������д�Ҷ��ǳ���Ϥ�����Ķ����ǣ�
����f(x) = 1 .... (x=1,2)
����f(x) = f(x-1) + f(x-2) .... (x>2)
�������ڸ��������� n �� m������ϣ�������
����f(1) + f(2) + ... + f(n) ��ֵ�������ֵ���ܷǳ����������ǰ����� f(m) ȡģ��
������ʽ����
 
���������������Ȼ�ܴ�������Ҫ�ٶ� p ��ģ��
�����ʽ
����Ϊһ���ÿո�ֿ������� n m p (0 < n, m, p < 10^18)
�����ʽ
���Ϊ1����������ʾ��
��������
2 3 5
�������
0
��������
15 11 29
�������
25
 


 * */

public class Solution_4 {

	private static  int fei(int n){
		if(n==0){return 0;}
		if(n==1){return 1;}
		return fei(n-1)+fei(n-2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m,p;
		int countn=0;
		n=input.nextInt();
		m=input.nextInt();
		p=input.nextInt();
		for(int i=1;i<n+1;i++){
			countn+=Solution_4.fei(i);
		}
		int result = (countn%(Solution_4.fei(m)))%p;
		System.out.println(result);
	}
	
}

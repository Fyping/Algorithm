package blueCup;

import java.util.Scanner;

/**
 * 
 * 斐波那契

问题描述
斐波那契数列大家都非常熟悉。它的定义是：
　　f(x) = 1 .... (x=1,2)
　　f(x) = f(x-1) + f(x-2) .... (x>2)
　　对于给定的整数 n 和 m，我们希望求出：
　　f(1) + f(2) + ... + f(n) 的值。但这个值可能非常大，所以我们把它对 f(m) 取模。
　　公式如下
 
　　但这个数字依然很大，所以需要再对 p 求模。
输入格式
输入为一行用空格分开的整数 n m p (0 < n, m, p < 10^18)
输出格式
输出为1个整数，表示答案
样例输入
2 3 5
样例输出
0
样例输入
15 11 29
样例输出
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

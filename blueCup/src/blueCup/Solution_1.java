package blueCup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 * 最大乘积

问题描述
对于n个数，从中取出m个数，如何取使得这m个数的乘积最大呢？
输入格式
第一行一个数表示数据组数
　　每组输入数据共2行：
　　第1行给出总共的数字的个数n和要取的数的个数m，1<=n<=m<=15，
　　第2行依次给出这n个数，其中每个数字的范围满足:a[i]的绝对值小于等于4。
输出格式
每组数据输出1行，为最大的乘积。
样例输入
15 51 2 3 4 5
样例输出
120

 * */
public class Solution_1 {

	public static void main(String[] args) {
		Vector<Integer> result = new Vector<Integer>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int nums [] = new int[n];
		int numsAbs [] = new int[n];
		TreeMap<Integer,Boolean> numsHash = new TreeMap<Integer,Boolean>(); 
		for(int i=0;i<n;i++){
			nums[i] = input.nextInt();
			numsAbs[i] = Math.abs(nums[i]);
			numsHash.put(i, nums[i]/numsAbs[i]==1?true:false);//正数为true，负数为false
		}
		Arrays.sort(numsAbs);
		int max=0;
		for(int i=0,j=n-1,k=0;i<m;i++){
		
			max =numsAbs[j]*numsAbs[k];
			if(Math.abs(nums[j--])>Math.abs(nums[k++])){
				max*=nums[j];
			}else{
				max*=nums[k];
			}
			
			if(i==m-1){
				int temp = max*nums[k++];
				int temp2 = max*nums[j--];
				if(temp>temp2){
					result.add(temp);
				}else{
					result.add(temp2);
				}
			}
			
		}
		System.out.println(result.get(0));
	}
}



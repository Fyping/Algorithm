package blueCup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 * ���˻�

��������
����n����������ȡ��m���������ȡʹ����m�����ĳ˻�����أ�
�����ʽ
��һ��һ������ʾ��������
����ÿ���������ݹ�2�У�
������1�и����ܹ������ֵĸ���n��Ҫȡ�����ĸ���m��1<=n<=m<=15��
������2�����θ�����n����������ÿ�����ֵķ�Χ����:a[i]�ľ���ֵС�ڵ���4��
�����ʽ
ÿ���������1�У�Ϊ���ĳ˻���
��������
15 51 2 3 4 5
�������
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
			numsHash.put(i, nums[i]/numsAbs[i]==1?true:false);//����Ϊtrue������Ϊfalse
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



package cn.com.fangself.Algorithm;

import java.util.Scanner;
public class Solution_1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len =input.nextInt();
		//System.out.println(2147483647/2);//1073741823
		String result[] =new String[10];
		for(int i=0;i<len;i++){
			double a=input.nextInt();
			double b=input.nextInt();
			double c= input.nextInt();
/*			if(a>c||b>c){
				result[i] =String.format("Case #%d: true",i+1);
				continue;
			}
			if((a<0&&b<c)||(b<0&&a<c)){
				result[i] =String.format("Case #%d: false",i+1);
				continue;
			}
			if(Math.abs(a)>=1073741823&&Math.abs(b)>=1073741823){
				if(a>0&&b>0){
					if(c>=1073741823){
						result[i] =String.format("Case #%d: true",i+1);
						continue;
					}else{
						result[i] =String.format("Case #%d: false",i+1);
						continue;
					}
				}
				if(a<0&&b<0){
					if(c>=1073741823){
						result[i] =String.format("Case #%d: false",i+1);
						continue;
					}else{
						result[i] =String.format("Case #%d: true",i+1);
						continue;
					}
				}
				
			}
			if(a==-2147483648){
				if(b<c){
					
				}else{
					
				}
			}*/
			result[i] =String.format("Case #%d: %s",i+1,(a+b>c?"true":"false"));
		}
		for(int i=0;i<len;i++){
			System.out.println(result[i]);
		}
	}
}

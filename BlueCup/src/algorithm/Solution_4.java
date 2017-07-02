package algorithm;
import java.util.Scanner;

public class Solution_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		char chs[] ={'A','B','C','D','E','F','G','H','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<n;i++){
			boolean is=true;
			for(int j=i,k=0;k<m;k++){
				System.out.print(chs[j]);
				if(is&&j==0){
					is=false;
				}
				if(is==true){
					j--;
				}else{
					j++;
				}
			}
			System.out.println("");
		}
	}

}

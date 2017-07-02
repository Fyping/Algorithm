package algorithm;
import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] pri = new int[34][34];
		pri[0][0]=1;
		pri[1][0]=1;
		pri[1][1]=1;
		int n;
		n=input.nextInt();
		n=n+1;
		for(int i=2;i<n;i++){
			pri[i][0]=1;
			for(int j=1;j<i;j++){
				if(j==i-1){
					pri[i][j]=1;
					continue;
				}
				pri[i][j]=pri[i-1][j]+pri[i-1][j-1];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(pri[i][j]!=0){
					System.out.print(pri[i][j]);
					if(j!=i-1){
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}

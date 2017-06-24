package blueCup;

import java.util.Scanner;

/**
 * �����������ϣ�����1986�꣬�ɿ���˹������������ģ�����ϸ���Զ�����һ�֡�
����ƽ���ϵ������θ��ӱ����Ϻ�ɫ���ɫ��������һ������������һֻ�����ϡ���
�������ϵ�ͷ������Ϊ��������������һ����
�������ϵ��ƶ�����ʮ�ּ򵥣�
�����������ںڸ���ת90�ȣ����ø��Ϊ�׸񣬲���ǰ��һ��
�����������ڰ׸���ת90�ȣ����ø��Ϊ�ڸ񣬲���ǰ��һ��
����������Ȼ�򵥣����ϵ���Ϊȴʮ�ָ��ӡ��ոտ�ʼʱ���µ�·�߶����нӽ��Գƣ����ǻ��ظ�����������ʼ״̬��Σ����Ͼ��������Ļ��һ�󣬻Ὺ�ٳ�һ������ġ����ٹ�·����
�������ϵ�·���Ǻ�������Ԥ��ġ�
������������Ǹ��ݳ�ʼ״̬���ü����ģ�����������ڵ�n�����ߺ�������λ�á�
�����ʽ
�������ݵĵ�һ���� m n ����������3 < m, n < 100������ʾ�����θ��ӵ�������������
������������ m �����ݡ�
����ÿ������Ϊ n �����ո�ֿ������֡�0 ��ʾ�׸�1 ��ʾ�ڸ�
������������һ�����ݣ�x y s k, ����x yΪ��������ʾ���������кź��кţ��кŴ��ϵ����������кŴ��������������Ǵ�0��ʼ��ţ���s ��һ����д��ĸ����ʾ����ͷ�ĳ�������Լ�����������ҷֱ��ã�UDLR��ʾ��k ��ʾ�����ߵĲ�����
�����ʽ
�������Ϊ�����ո�ֿ������� p q, �ֱ��ʾ������k�����������ӵ��кź��кš�
��������
5 6
0 0 0 0 0 0
0 0 0 0 0 0
0 0 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
2 3 L 5
�������
1 3
��������
3 3
0 0 0
1 1 1
1 1 1
1 1 U 6
�������
0 0
s
 * */
class Statu{
	int x;
	int y;
	String aim;
	public Statu(int x, int y, String aim){
		this.x = x;
		this.y = y;
		this.aim = aim;
	}
	public Statu(){}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getAim() {
		return aim;
	}
	public void setAim(String aim) {
		this.aim = aim;
	}
	
}
public class Solution_3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int m ,n;
		m=input.nextInt();
		n=input.nextInt();
		int mat [][] = new int[m][n];
		int x,y,k;
		String s;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = input.nextInt();
			}
		}
		x=input.nextInt();
		y=input.nextInt();
		s=input.next();
		k=input.nextInt();
		Statu statu = new Statu(x,y,s);
		for(int z=0;z<k;z++){
			statu = move(mat,statu);
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
			//		System.out.print(mat[i][j]+" ");
				}
		//		System.out.println("");
			}
		}
		System.out.printf("%d  %d",statu.x,statu.y);
	}

	private static Statu move(int [][] pos,Statu statu) {
		Statu result = new Statu();
		int x = statu.x;
		int y = statu.y;
		switch(statu.aim){
			case "U":{
				result.x = x;
				if(pos[x][y]==1){
					result.aim="R";
					result.y=y+1;
				}else{
					result.aim = "L";
					result.y =y-1;
				}
			}break;
			case "D":{
				result.x=x;
				if(pos[x][y]==1){
					result.aim="L";
					result.y=y-1;
				}else{
					result.aim = "R";
					result.y=y+1;
				}
			}break;
			case "L":{
				result.y=y;
				if(pos[x][y]==1){
					result.aim="U";
					result.x=x-1;
				}else{
					result.aim = "D";
					result.x=x+1;
				}
			}break;
			case "R":{
				result.y=y;
				if(pos[x][y]==1){
					result.aim="D";
					result.x=x+1;
				}else{
					result.aim = "U";
					result.x=x-1;
				}
			}break;
		}
		pos[x][y] = pos[x][y]==1?0:1;
		return result;
	}
}

package Algorithm;

/* 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 */

public class Algorithm2438 {
	public void print(int a){
		if( 1<= a && a <= 100){
			for(int i=1; i <= a; i ++){
				for(int j=1; j <= i; j ++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

/**
 * 2018. 7. 19.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */
public class Algorithm2440 {
	public void print(int a){
		if(1 <= a && a <= 100){
			for(int i=0 ; i < a; i ++){
				for(int j = i; j <a ; j ++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
/**
 * 2018. 7. 19
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 		 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
 */
public class Algorithm2439 {
	public void print(int a){
		if(1 <= a && a <= 100){
			for(int i=1 ; i <= a; i ++){
				for(int j = i; j <a ; j ++){
					System.out.print(" ");
				}
				for(int j = i ; j >0;j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

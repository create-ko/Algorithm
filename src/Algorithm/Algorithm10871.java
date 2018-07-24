/**
 * 2018. 7. 24.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class Algorithm10871 {
	public void print(int a, int b, int[] c){
		for(int i =0;i < a; i++){
			if(c[i]< b){
				System.out.print(c[i] + " ");
			}
		}
	}
}

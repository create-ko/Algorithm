/**
 * 2018. 7. 24.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 */
public class Algorithm10817 {
	public void print(int a, int b, int c){
			if ((a >= b && b >= c) || (c >= b) && (b >= a)){
				System.out.println(b);
			}else if ((b >= a && a >= c) || (c >= a && a >= b)){
				System.out.println(a);
			}else{
				System.out.println(c);	
			}
	}
}

/**
 * 2018. 7. 23.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
public class Algorithm8393 {
	int sum = 0;
	public void print(int a){
		for(int i=1; i <=a;i++){
			sum += i;
		}
		System.out.println(sum);
	}
}

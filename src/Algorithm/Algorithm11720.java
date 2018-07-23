/**
 * 2018. 7. 23.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
public class Algorithm11720 {

	int sum=0;
	public void print(String a, String s){
		int len = Integer.parseInt(a);
		for(int i=0;i<len;i++){
			sum += Character.getNumericValue( s.charAt(i));
		}
		System.out.println(sum);
	}
}

/**
 * 2018. 7. 23.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 */
public class Algorithm1924 {
	private String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
	private int[] date= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private int sum = 0;
	
	public void print(int a, int b){
		for(int i=0;i<a;i++){
			sum += date[i];
		}
		sum = sum + b -1;
		sum = sum % 7;
		System.out.println(day[sum]);
	}
}

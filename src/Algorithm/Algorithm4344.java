/**
 * 2018. 7. 25.
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author SH
 * 문제 : 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 */
public class Algorithm4344 {
	public void print(int a){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a;i++){
			int sum = 0;
			float cnt =0;
			int TestCase = sc.nextInt();
			int[] data = new int[TestCase];
			for(int j=0;j<TestCase;j++){
				data[j] = sc.nextInt();
				sum += data[j];
			}
			int avg = sum / TestCase;
			
			for(int j=0;j<TestCase;j++){
				if(data[j]>avg){
					cnt++;
				}
			}
			System.out.println(String.format("%.3f", (cnt/TestCase) * 100));
			
		}
		
	}
}

/**
 * 2018. 7. 24.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class Algorithm9498 {
	public void print(int a){
		if(0 <=  a && a <=100 ){
			if(a>= 90){
				System.out.println("A");
			}else if(a>=80){
				System.out.println("B");
			}else if(a>=70){
				System.out.println("C");
			}else if(a>= 60){
				System.out.println("D");
			}else{
				System.out.println("F");
			}
		}
		
	}
}

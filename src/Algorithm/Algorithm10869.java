package Algorithm;

/* 문제 : 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.  */

public class Algorithm10869 {
	public void print(int A, int B){
		if(1 <= A && B <= 10000){
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		}
	}
}

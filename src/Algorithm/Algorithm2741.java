package Algorithm;

/* 문제 :  자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오. */

public class Algorithm2741 {
	public void print(int a){
		if( 0 < a &&a <= 100000 ){
			for(int i = 1; i <= a; i++){
				System.out.println(i);
			}
		}
	}
}

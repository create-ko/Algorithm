package Algorithm;

/* 문제 :  N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다. */

public class Algorithm2739 {
	public void print(int a){
		if(1 <= a && a <= 9){
			for(int i=1; i<10; i++){
				System.out.println(a +" * " + i  + " = " + a*i);
			}
		}
	}
	
}
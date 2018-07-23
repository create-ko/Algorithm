/**
 * 2018. 7. 23.
 */
package Algorithm;

/**
 * @author SH
 * 문제 : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 			한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */
public class Algorithm11721 {
	public void print(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
			if((i+1)%10 == 0){
				System.out.println();
			}
		}
	}
}

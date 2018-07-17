package Algorithm;

import java.util.Scanner;

/* 문제 : 그대로 출력하기 */

public class Algorithm11718 {
	public void print(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String word = sc.nextLine();
			 if (word.startsWith(" ") || word.endsWith(" ") || word.length()>100 || word.isEmpty()) {
	                break;
			 }
			System.out.println(word);
		}
		sc.close();
	}
	
//	import java.util.Scanner;
//	public class Main{
//	    public static void main(String[] args){
//	        Scanner sc = new Scanner(System.in);
//			
//			while(sc.hasNextLine()){
//				String word = sc.nextLine();
//	             if (word.startsWith(" ") || word.endsWith(" ") || word.length()>100 || word.isEmpty()) {
//		                break;
//				 }
//				System.out.println(word);
//			}
//	        sc.close();
//	    }
//	}
}

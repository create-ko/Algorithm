/**
 * 2018. 7. 23.
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author SH
 * 문제 : 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 *			  Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
 * 		  BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 */
public class Algorithm15552 {
	
//	Algorithm15552 agm = new Algorithm15552();
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	agm.print(br, bw);
//	br.close();
	
	
	public void print(BufferedReader br, BufferedWriter bw ) throws IOException {
		StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int[] plusArray = new int[t];
        
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            plusArray[i] = a+b;
        }
        
        for(int output : plusArray) {
            bw.write(String.valueOf(output));
            bw.newLine();
        }
        bw.flush();
	}
        
}
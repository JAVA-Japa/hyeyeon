package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon17945 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int root = (int)Math.sqrt(4*a*a-4*b);
    	int result1 = (-2*a-root)/2;
    	int result2 = (-2*a+root)/2;
    	
       if(result1==result2) {
    	   sb.append(result1);
       }
       else if(result1<result2) {
    	   sb.append(result1 + " " + result2);
       }
       else {
    	   sb.append(result2 + " " + result1);
       }   	   
    	   
        System.out.println(sb);
	}
}

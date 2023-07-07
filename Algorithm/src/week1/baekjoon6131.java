package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon6131 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int cnt = 0;
		for(int i=1;i<=500;i++) {
			for(int j=1;j<=500;j++) {
					if(i*i+N==j*j)
						cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
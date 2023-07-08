package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon16283 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a =  Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int result1 = 0, result2=0;
		
		for(int i=1;i<=1000;i++) { 
			for(int j=1;j<=1000;j++) {
				if(i+j==n&&i*a+j*b==w) {
					result1=i;
					result2=j;
					cnt++;
					break;
				}
			}
		}
		
		if(cnt==1) {
			sb.append(result1+" "+result2);
		}
		else {
			sb.append(-1);
		}
		
		System.out.println(sb);
		
	}
}
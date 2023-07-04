package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon14568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i=1;i<n/2;i++) {
			for(int j=1; true;j++) {
				if(n-2*i-2*j>=2)
					count++;
				else
					break;
			}
		}
		System.out.println(count);
	}
}

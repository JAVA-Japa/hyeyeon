package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1145 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		int num=1;
		
		while(true) {
			int cnt=0;
			if(num%a==0)
				cnt++;
			if(num%b==0)
				cnt++;
			if(num%c==0)
				cnt++;
			if(num%d==0)
				cnt++;
			if(num%e==0)
				cnt++;
			
			if(cnt>=3)
				break;
			num++;
		}
		System.out.println(num);
	}
}

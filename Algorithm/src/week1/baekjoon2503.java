package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2503 {
	//스크라이트
	public static int same_count(int s, int l) {
		int count=0;
		for(int i=0;i<3;i++) {
			if(s%10 == l%10)
				count++;
			s/=10;
			l/=10;
		}
		return count;
	}
	//볼
	public static int ball(int s, int l) {
		int cnt = 0;
		int k = l;
		for(int j=0;j<3;j++) {
			l = k;
			for(int i=0;i<3;i++) {
				if(i!=0) {
					l/=10;
				}
				if(i==j) continue;
				if(s%10 == l%10) {
					cnt++;
					}
				}
			s/=10;

		}
		return cnt;				
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i=1;i<=9;i++) {
			int result = 0;
			for(int j=1;j<=9;j++)
				for(int k=1;k<=9;k++) {
					if(i!=j && j!=k && i!=k)
						result = i*100+j*10+k;
					
					int count=0;
					for(int l=0;l<n;l++) {
						if(arr[l][1]==same_count(arr[l][0], result) && ball(arr[l][0],result)==arr[l][2])
							count++;
					}
					if(count==n)
						cnt++;
				}
		}
		
		System.out.println(cnt);
		
	}
}
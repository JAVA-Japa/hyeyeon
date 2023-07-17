package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) 
			arr[i] = Integer.parseInt(st2.nextToken());
		
		int start = 0;
		int end = 0;
		int cnt = 0;
		int sum = 0;

		while(true) {
			if(sum>=M)
				sum-=arr[start++];
			else if(end==N)
				break;
			else
				sum+=arr[end++];
			
			if(sum==M)
				cnt++;
		}
		
		System.out.println(cnt);
		
	}
}

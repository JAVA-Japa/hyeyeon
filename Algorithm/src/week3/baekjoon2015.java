package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int K = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N+1];
		arr[0] = 0;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++)
			arr[i] = Integer.parseInt(st2.nextToken());
		
	
		int start = 1;
		int end = 1;
		int sum = 0;
		int cnt = 0;
		while(true) {
			if(end == N+1)
				break;
			else if(sum>=K)
				sum -= arr[start++];
			else
				sum += arr[end++];
			if(sum == K)
				cnt++;
		}
		for(int i=1;i<=N;i++)
			arr[i] = arr[i-1]+arr[i];
		if(arr[N]==K)
			cnt++;
		
		System.out.println(cnt);
	}
}

package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		int[] arr = new int[N+1];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		arr[0] = 0;
		for(int i=1;i<=N;i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
			arr[i] = arr[i-1] + arr[i]; //누적합
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st3.nextToken());
			int end = Integer.parseInt(st3.nextToken());
			int sum = arr[end]-arr[start-1];
			sb.append(sum+"\n");
		}
		
		System.out.println(sb);
		
	}
}

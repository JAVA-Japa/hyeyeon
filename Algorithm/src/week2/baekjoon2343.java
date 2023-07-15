package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2343 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int start = 0;
		int end = 0;
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
			if(start<arr[i])
				start = arr[i];
			end+=arr[i];
		}
		
		
		while(start<=end) {
			int sum = 0;
			int cnt = 0;
			int mid = (start+end)/2;
			for(int i=0;i<N;i++) {
				if(sum+arr[i]>mid) {
					cnt++;
					sum=0;
				}
				sum += arr[i];
			}
			
			if(cnt!=0) cnt++;
			if(cnt>M)
				start = mid+1;
			else
				end = mid-1;

		}
		System.out.println(start);
	}
}

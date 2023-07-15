package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon2110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int start = 1;
		int end = arr[N-1]-arr[0];
		while(start<=end) {
			int mid = (start+end)/2;
			int result = arr[0];
			int cnt = 1;
			for(int i=0;i<N;i++) {
				if(arr[i]-result>mid) {
					cnt++;
					result = arr[i];
				}
			}
			if(cnt>=C) {
				start = mid+1;
			}
			else
				end = mid-1;
		}
		System.out.println(start);
	}
}

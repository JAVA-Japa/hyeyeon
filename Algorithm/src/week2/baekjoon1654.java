package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[k];
		
		for(int i=0;i<k;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long start = 1;
		long end = arr[k-1];
		
		while(start<=end) {
			long mid=(start+end)/2;
			long cnt = 0;

			for(int i=0;i<k;i++) {
				cnt += arr[i]/mid;
			}
				
			if(cnt>=n) {
				start = mid+1;
			}
			else
				end = mid-1;		
		}
		
		System.out.println(start-1);
		
	}
}

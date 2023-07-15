package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon2512 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arrSum=0;
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arrSum+=arr[i];
		}

		int M = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		long start = 1;
		long end = arr[N-1];
		
		if(arrSum<=M) //모든 요청이 배정될 수 있는 경우
			System.out.println(arr[N-1]);
		else {
		while(start<=end) {
			long sum = 0;
			long mid = (start+end)/2;
			
			for(int i=0;i<N;i++) {
				if(mid>arr[i])
					sum+=arr[i];
				else
					sum+=mid;
			}
			
			if(sum>M) {
				end = mid-1;
			}
			else
				start = mid+1;
		}
		System.out.println(start-1);
		}
	}
}

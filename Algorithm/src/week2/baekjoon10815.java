package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr1[i] = Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr1);
		
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++)
			arr2[i] = Integer.parseInt(st2.nextToken());
		
		for(int i=0;i<M;i++) {
			int start = 0;
			int end = N-1;
			int flag=0;
			
			while(start<=end) {
				int mid = (start+end)/2;
				if(arr2[i]==arr1[mid]) {
					sb.append(1+" ");
					flag=1;
					break;
				}
				else if(arr2[i]>arr1[mid])
					start = mid+1;
				else
					end = mid-1;
			}
			if(flag==0)
				sb.append(0+" ");
		}
		
		System.out.println(sb);
	}
}

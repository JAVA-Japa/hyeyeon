package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int N = 0;

		for(int i=0;i<T;i++) {
			N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			int cnt = 1;

			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			// 정렬
						Arrays.sort(arr, new Comparator<int[]>() {
							@Override
							public int compare(int[] arr1, int[] arr2) {	// 서류를 기준으로 오름차순 정렬을 시행한다.
								return Integer.compare(arr1[0], arr2[0]);
							}
						});
						
			int result = arr[0][1];
			for(int j=1;j<N;j++) {
				if(arr[j][1]<result) {
					result = arr[j][1];
					cnt++;
				}
			}
			
			sb.append(cnt+"\n");
		
	}
		System.out.println(sb);

	}
	}

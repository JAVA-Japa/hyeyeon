package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon1644 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		//에라토스테네스의 체: 소수를 판별하는 알고리즘
		ArrayList<Integer> prime = new ArrayList<>();
		boolean check[] = new boolean[N+1];
		check[0] = check[1] =true;
		for(int i=2; i*i<=N; i++) {
			if(!check[i]) {
				for(int j=i*i; j<=N; j+=i) {
					check[j] = true;
				}
			}
		}
		for(int i=0; i<=N; i++)
			if(!check[i])
				prime.add(i);

		int sum = 0;
		int start = 0;
		int end = 0;
		int cnt = 0;
		
		while(true) {
			if(sum>=N) {
				sum -= prime.get(start);
				start++;
			}
			else if(end==prime.size())
				break;
			else {
				sum += prime.get(end);
				end++;
			}
			if(sum==N)
				cnt++;
		}
		System.out.println(cnt);
	}
}

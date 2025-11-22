import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			int max_profit = Integer.MIN_VALUE;
			long sum = 0;
			
			for (int j = N - 1; j >= 0; j--) {
				if (arr[j] > max_profit) {
					max_profit = arr[j];
				}
				sum += max_profit -arr[j];
			}

			System.out.println("#" + (i + 1) + " " + sum);
		}

	}
}
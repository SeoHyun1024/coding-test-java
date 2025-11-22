import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			sb.append(isValid(s) ? "yes" : "no").append('\n');
		}
		System.out.println(sb.toString());

	}

	static boolean isValid(String s) {
		int n = s.length();
		int[] cnt = new int[10];
		int[] first = new int[10];
		int[] second = new int[10];

		Arrays.fill(first, -1);
		Arrays.fill(second, -1);

		for (int j = 0; j < n; j++) {
			int d = s.charAt(j) - '0';

			cnt[d]++;
			if (cnt[d] == 1)
				first[d] = j;
			else if (cnt[d] == 2)
				second[d] = j;
			else
				return false;
		}

		for (int j = 0; j < 10; j++) {
			if (cnt[j] == 1)
				return false;
			if (cnt[j] == 2) {
				if (second[j] - first[j] - 1 != j)
					return false;
			}
		}

		return true;
	}
}
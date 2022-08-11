package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B1339_단어수학 {

	// 1. 문자열로 받기
	// 2. 문자열로 받은 걸 앞부터 10의 n승 해 주기
	// 3. 그걸 더해 주기 (더한 후에 자릿수 바뀌니까 10분의 1씩)
	// 4. 오름차순 정렬한 다음에 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		int[] arr = new int[26];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		for (int i = 0; i < N; i++) {
			int tmp = (int) Math.pow(10, (str[i].length()- 1));
			for (int j = 0; j < str[i].length(); j++) {
				arr[(int)str[i].charAt(j) - 65] += tmp;
				tmp /= 10;
			}
		}
		Arrays.sort(arr);
		int idx = 9;
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 0) {
				break;
			}
			sum += arr[i] * idx;
			idx--;
		}
		System.out.println(sum);
	}

}

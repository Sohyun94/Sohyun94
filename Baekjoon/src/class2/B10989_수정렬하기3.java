package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시간 초과 피하기 위하여 카운팅 정렬로 풀기
public class B10989_수정렬하기3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//숫자 범위 : 1 ~ 10000
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int [10001];
		
		// 입력값 받아주기
		for(int i = 0; i < N; i++)
			arr[Integer.parseInt(bf.readLine())]++;
		
		bf.close();
		
		// 1부터 시작
		for(int i = 1 ; i < 10001; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.println(sb);

	} // main

}

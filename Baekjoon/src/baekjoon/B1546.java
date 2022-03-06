package baekjoon;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; //배열 생성
		int max = 0; //최대값
		int sum = 0; //합계
		double avg = 0.0; //평균(실수)
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			//배열 요소들 입력 가능하게
			if(arr[i] > max) {
				max = arr[i];
			} //배열 요소가 더 크면 그 값을 최대값으로
		sum += arr[i]; //요소들 전부 합함
		}
		avg = 100.0 * sum / max / n; // 평균 = 100*합계/최대값/요소 수
		System.out.println(avg); //평균 출력

	}

}

package level2;

import java.util.Scanner;

// 처음으로 풀어보 softeer 문제인데 난이도가 낮긴 해도 바로 맞혀서 뿌듯하다
// 규칙을 이해하면 굉장히 쉬운 문제
// 사각형 수가 2의 N승을 제곱한 만큼 늘어나는데,
// 꼭짓점은 거기에 +1 한 것이기 때문에
// (2^N +1) ^ 2으로 계산 가능하다
public class 지도자동구축 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력 값
		// pow로 계산한 값은 double로 받아줘야 함을 유의하자
		double square = Math.pow(2, N) + 1;
		double point = Math.pow(square, 2);
		// 정답 출력할 때는 다시 int로 변환해 주기
		System.out.println((int)point);
	} // main
	

} // class

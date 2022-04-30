package class2;

import java.util.Scanner;

public class B1259_펠린드롬수_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한 루프
		while (true) {
			// 정수 문자열로 바꿔서 받기
			String str = Integer.toString(sc.nextInt());
			// 0이 입력되면 while문 빠져나가기
			if (str.equals("0"))
				break;
			// 시작 지점 인덱스 : 0, 끝 지점 인덱스 : 문자열 길이 0 -1
			int start = 0;
			int end = str.length() - 1;
			// 펠린드롬수 여부 확인할 boolean 변수
			boolean check = true;
			// start 인덱스가 end 인덱스를 넘지 않는 지점까지
			while (start <= end) {
				// 둘이 다르면
				if (str.charAt(start) != str.charAt(end)) {
					// 펠린드롬수 아님
					check = false;
					// 더 검사할 필요 없으므로 while문 빠져나가기
					break;
					// 둘이 같으면
				} else {
					// 인덱스 한 칸씩 변화 주고 다시 검사
					start++;
					end--;
				}
			}
			// check가 true면 펠린드롬수, 아니면 아님
			if (check == true)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}

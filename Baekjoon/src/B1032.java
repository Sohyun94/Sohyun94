import java.util.Scanner;

public class B1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N]; // 문자열 담아 줄 배열
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		} // 담기

		StringBuilder sb = new StringBuilder();
		boolean isSame = true; // 같은지 판별할 변수
		// string 길이까지 비교했을 때
		for (int i = 0; i < arr[0].length(); i++) {
			// char로 string을 잘라 주고
			char c = arr[0].charAt(i);
			// 다시 true로 복귀
			isSame = true;
			
			// 두 번째 항이랑 비교
			for (int j = 1; j < N; j++) {
				// 비교했는데 다르면
				if (c != arr[j].charAt(i)) {
					// false
					isSame = false;
					break;
				}
			}
			// 같으면 그대로 출력
			if (isSame == true) {
				sb.append(c);
				// 다르면 ? 출력
			} else {
				sb.append('?');
			}
		}
		System.out.println(sb.toString());
	}

}

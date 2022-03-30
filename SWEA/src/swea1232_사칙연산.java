import java.util.Scanner;

public class swea1232_사칙연산 {
	static String[][] tree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt(); // 정점 수

			tree = new String[N + 1][]; // 노드 1번부터 하기 위해 +1
			sc.nextLine(); // 캐리지 리턴 버리기
			for (int i = 1; i <= N; i++) {
				tree[i] = sc.nextLine().split(" "); // 공백 포함 한 줄로 받으려고
			} // 입력 끝
			
			System.out.println("#" + tc + " " + (int)op(1));

		} // tc

	}// main

	private static double op(int idx) {
		if(tree[idx][1].equals("+")) //더하기
			return op(Integer.parseInt(tree[idx][2])) + op(Integer.parseInt(tree[idx][3]));
		else if(tree[idx][1].equals("-")) //빼기
			return op(Integer.parseInt(tree[idx][2])) - op(Integer.parseInt(tree[idx][3]));
		else if(tree[idx][1].equals("*")) //곱하기
			return op(Integer.parseInt(tree[idx][2])) * op(Integer.parseInt(tree[idx][3]));
		else if(tree[idx][1].equals("/")) //나누기
			return op(Integer.parseInt(tree[idx][2])) / op(Integer.parseInt(tree[idx][3]));
		else //숫자일 때
			return Double.parseDouble(tree[idx][1]); //묵시적 형변환 때문에 integer로 해도 상관 X
	}

}

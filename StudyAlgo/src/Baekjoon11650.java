import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] points = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());
		} // 점의 좌표 받기

		Arrays.sort(points, (o1, o2) -> {
			if (o1[0] == o2[0])
				return o1[1] - o2[1];
			else
				return o1[0] - o2[0];
		}); // 람다식 정렬

		for (int i = 0; i < N; i++) {
			System.out.println(points[i][0] + " " + points[i][1]);
		}
	}
}

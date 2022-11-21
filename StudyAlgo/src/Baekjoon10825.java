import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon10825 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] grades = new String[N][4];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			grades[i][0] = st.nextToken();
			grades[i][1] = st.nextToken();
			grades[i][2] = st.nextToken();
			grades[i][3] = st.nextToken();
			
		} // 배열 받기 끝
		
		Arrays.sort(grades, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(o2[1].equals(o1[1])) {
					if(o1[2].equals(o2[2])) {
						if(o1[3].equals(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}
						return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
					}
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
				}
				return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
			}
		}); // 정렬 끝
		for(int i = 0; i < N; i++) {
			System.out.println(grades[i][0]);
		}

	}

}
